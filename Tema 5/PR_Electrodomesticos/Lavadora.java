public class Lavadora extends Electrodomestico {
    protected int carga;
    double precio;

    public Lavadora(int precio_base, Colores color, String consumo_energetico, int peso, int carga) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
        PrecioFinal();
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Lavadora" +
                "\n * Carga= " + carga +
                "\n * Consumo Energético = " + consumo_energetico +
                "\n * Peso = " + peso +
                "\n * Precio = " + precio + " €";
    }

    @Override
    protected int PrecioFinal() {
        precio = super.PrecioFinal();
        if (carga > 6) {
            precio += 50;
        }
        return (int) precio;
    }

}








