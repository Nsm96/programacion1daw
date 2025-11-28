public class Television extends Electrodomestico {
    protected int resolucion;
    protected boolean netflix;
    int precio_sin_recargo;


    public Television(int precio_base, Colores color, String consumo_energetico, int peso, int resolucion, boolean netflix) {
        super(precio_base, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
        PrecioFinal();
    }

    @Override
    public String toString() {
        return "Televisión" +
                "\n * Resolución = " + resolucion + "''" +
                "\n * Consumo Energético = " + consumo_energetico +
                "\n * Peso = " + peso +
                "\n * Netflix = " + netflix +
                "\n * Precio = " + precio + " €";
    }

    @Override
    protected int PrecioFinal() {
        precio_sin_recargo = this.precio_base;
        precio = super.PrecioFinal();
        if (resolucion > 20){
            precio += precio_sin_recargo * 0.30;
        }
        if (netflix){
            precio += 60;
        }
        return (int) precio;
    }

}

