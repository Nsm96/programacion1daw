public class Main {
    public static void main(String[] args) {
        ProductoElectronico productoElectronico = new ProductoElectronico("Televisor", 799.99, 220);
        ProductoAlimenticio productoAlimenticio = new ProductoAlimenticio("Pan", 1.50, 500);

        System.out.println("Producto Electrónico:");
        System.out.println("Nombre: " + productoElectronico.getNombre());
        System.out.println("Precio: " + productoElectronico.getPrecio() + " €");
        System.out.println("Voltaje: " + productoElectronico.getVoltaje() + " V");

        System.out.println("\nProducto Alimenticio:");
        System.out.println("Nombre: " + productoAlimenticio.getNombre());
        System.out.println("Precio: " + productoAlimenticio.getPrecio() + " €");
        System.out.println("Peso: " + productoAlimenticio.getPeso() + " gramos");
    }
}
