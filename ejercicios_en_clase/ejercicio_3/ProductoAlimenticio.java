public class ProductoAlimenticio extends Producto {

    private int peso;

    public ProductoAlimenticio(String nombre, double precio, int peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}