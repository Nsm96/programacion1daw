public class Electrodomestico {
    protected int precio_base;
    protected Colores color;
    protected String consumo_energetico;
    protected int peso;
    double precio;

    public Electrodomestico() {
        this.precio_base = 100;
        this.color = Colores.Blanco;
        this.consumo_energetico = "A";
        this.peso = 10;
        this.ComprobarConsumoElectrico();
    }

    public Electrodomestico(int precio_base, Colores color, String consumo_energetico, int peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
        this.ComprobarConsumoElectrico();
    }

    protected void ComprobarConsumoElectrico() {
        if (!consumo_energetico.equals("A+") && !consumo_energetico.equals("A") && !consumo_energetico.equals("B") && !consumo_energetico.equals("C") && !consumo_energetico.equals("D") && !consumo_energetico.equals("E") && !consumo_energetico.equals("F")) {
            consumo_energetico = "A";
        }
    }
    protected int PrecioFinal(){
        double precio = precio_base;
        switch (consumo_energetico){
            case "A+":
                precio = precio_base + 120;
            break;
            case "A":
                precio = precio_base + 100;
            break;
            case "B":
                precio = precio_base + 80;
            break;
            case "C":
                precio = precio_base + 60;
            break;
            case "D":
                precio = precio_base + 50;
            break;
            case "E":
                precio = precio_base + 30;
            break;
            case "F":
                precio = precio_base + 10;
            break;

        }

        if(peso > 0 && peso <= 19){
            precio += 10;
        } else if (peso >= 20 && peso <= 49){
            precio += 30;
        } else if (peso >= 50 && peso <= 79){
            precio += 50;
        } else if (peso >=80){
            precio += 100;
        }
        return (int) precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico" +
                "\n color = " + color +
                "\n precio_base = " + precio_base +
                "\n consumo_energetico = " + consumo_energetico +
                "\n peso = " + peso;
    }

    public int getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(int precio_base) {
        this.precio_base = precio_base;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public String getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(String consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;

    }
}
