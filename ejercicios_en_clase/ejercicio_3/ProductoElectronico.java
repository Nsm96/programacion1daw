public class ProductoElectronico extends Producto {

    private int voltaje;

    public ProductoElectronico(String nombre, double precio, int voltaje) {
        super(nombre, precio);
        this.voltaje = voltaje;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }
}