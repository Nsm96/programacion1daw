public class Lavadora extends Electrodomestico {
    protected int carga = 5;

    
    public Lavadora() {
    }

    public Lavadora(int precio_base, Colores color, String consumo_energetico, int peso) {
        super(precio_base, color, consumo_energetico, peso);
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "peso=" + peso +
                ", consumo_energetico='" + consumo_energetico + '\'' +
                ", color=" + color +
                ", precio_base=" + precio_base +
                '}';
    }


}

