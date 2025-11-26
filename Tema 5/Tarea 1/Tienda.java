public class Tienda {
    protected String producto;
    protected double precio;
    protected int iva;
    protected int descuento;

    private static int num_productos = 0;
    private static int descuento_global = 0;

    // constructor
    public Tienda() {
            this.precio = 10;
            this.iva = 21;
            this.descuento = 0;
            num_productos++;
            this.calcularPrecio();
    }

    public Tienda(String producto, double precio, int iva, int descuento) {
            this.producto = producto;
            this.precio = precio;
            this.iva = iva;
            this.descuento = descuento;
            num_productos++;
    }


    public double calcularPrecio() {
        int descuento_Aplicado = Math.max(descuento, descuento_global);
        double precioConDescuento = precio - (precio * descuento_Aplicado / 100);
        return precioConDescuento + (precioConDescuento * iva / 100);

    }

    // to string

    @Override
    public String toString() {
        return "Tienda{" +
                "producto='" + producto + '\'' +
                ", precio=" + precio +
                ", iva=" + iva +
                ", descuento=" + descuento +
                ", precio total= " + calcularPrecio() +
                '}';
    }


    // get y set

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public static int getNum_productos() {
        return num_productos;
    }

    public static int getDescuento_global() {
        return descuento_global;
    }

    public static void setDescuento_global(int descuento_global) {
        Tienda.descuento_global = descuento_global;
    }
}
