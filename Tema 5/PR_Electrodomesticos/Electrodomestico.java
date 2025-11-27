public class Electrodomestico {
    protected int precio_base;
    protected Colores color;
    protected String consumo_energetico;
    protected int peso;

    public Electrodomestico() {
        this.precio_base = 100;
        this.color = Colores.Blanco;
        this.consumo_energetico = "A";
        this.peso = 10;
        this.ComprobarConsumoElectrico();
        this.PrecioFinal();
    }

    public Electrodomestico(int precio_base, Colores color, String consumo_energetico, int peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
        this.ComprobarConsumoElectrico();
        this.PrecioFinal();
    }

    private void ComprobarConsumoElectrico() {
        if (consumo_energetico != "A+" || consumo_energetico != "A" || consumo_energetico != "B" || consumo_energetico != "C" || consumo_energetico != "D" || consumo_energetico != "E" || consumo_energetico != "F"){
            consumo_energetico = "A";
        }
    }
    private void PrecioFinal(){
        switch (consumo_energetico){
            case "A+":
                precio_base = precio_base + 120;
            break;
            case "A":
                precio_base = precio_base + 100;
            break;
            case "B":
                precio_base = precio_base + 80;
            break;
            case "C":
                precio_base = precio_base + 60;
            break;
            case "D":
                precio_base = precio_base + 50;
            break;
            case "E":
                precio_base = precio_base + 30;
            break;
            case "F":
                precio_base = precio_base + 10;
            break;
        }
        if(peso > 0 && peso <= 19){
            precio_base += 10;
        } else if (peso >= 20 && peso <= 49){
            precio_base += 30;
        } else if (peso >= 50 && peso <= 79){
            precio_base += 50;
        } else if (peso >=80){
            precio_base += 100;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio_base=" + precio_base +
                ", color=" + color +
                ", consumo_energetico='" + consumo_energetico + '\'' +
                ", peso=" + peso +
                '}';
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