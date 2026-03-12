import java.util.*;

public class Tienda_Ejecutadora {

    private static Map<String, Producto> productos = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 5 productos iniciales
        productos.put("P001", new Producto("P001", "Teclado", 19.99, 10, true));
        productos.put("P002", new Producto("P002", "Ratón", 9.99, 0, true));
        productos.put("P003", new Producto("P003", "Monitor", 129.99, 5, true));
        productos.put("P004", new Producto("P004", "Portátil", 699.99, 2, true));
        productos.put("P005", new Producto("P005", "Auriculares", 29.99, 0, true));

        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Elige opción: ");

            switch (opcion) {
                case 1 -> altaProducto();
                case 2 -> modificarStock();
                case 3 -> listarDisponiblesOrdenNombre();
                case 4 -> listarSinStock();
                case 5 -> borrarProducto();
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== TIENDA ONLINE ===");
        System.out.println("1. Alta de producto");
        System.out.println("2. Modificar stock");
        System.out.println("3. Listado de productos disponibles");
        System.out.println("4. Listado de productos sin stock");
        System.out.println("5. Borrar producto");
        System.out.println("6. Salir");
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.print("Introduce un número válido: ");
            sc.next();
        }
        int num = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea
        return num;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.print("Introduce un número válido: ");
            sc.next();
        }
        double num = sc.nextDouble();
        sc.nextLine();
        return num;
    }

    // 1. Alta de producto (sin código duplicado)
    private static void altaProducto() {
        System.out.print("Código del producto: ");
        String codigo = sc.nextLine();

        if (productos.containsKey(codigo)) {
            System.out.println("Ya existe un producto con ese código.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        double precio = leerDouble("Precio: ");
        int stock = leerEntero("Stock: ");

        Producto p = new Producto(codigo, nombre, precio, stock, true);
        productos.put(codigo, p);

        System.out.println("Producto dado de alta.");
    }

    // 2. Modificar stock
    private static void modificarStock() {
        System.out.print("Código del producto a modificar: ");
        String codigo = sc.nextLine();

        Producto p = productos.get(codigo);
        if (p == null) {
            System.out.println("No existe ese producto.");
            return;
        }

        int nuevoStock = leerEntero("Nuevo stock: ");
        p.setStock(nuevoStock);
        System.out.println("Stock actualizado: " + p);
    }

    // 3. Listado de productos disponibles (disponible = true) ordenados por nombre
    private static void listarDisponiblesOrdenNombre() {
        List<Producto> lista = new ArrayList<>();

        for (Producto p : productos.values()) {
            if (p.isDisponible()) {
                lista.add(p);
            }
        }

        // ordenar por nombre (Comparator sencillo)
        lista.sort(Comparator.comparing(Producto::getNombre));

        System.out.println("=== Productos disponibles (ordenados por nombre) ===");
        for (Producto p : lista) {
            System.out.println(p);
        }
    }

    // 4. Listado de productos sin stock (stock = 0)
    private static void listarSinStock() {
        System.out.println("=== Productos sin stock ===");
        for (Producto p : productos.values()) {
            if (p.getStock() == 0) {
                System.out.println(p);
            }
        }
    }

    // 5. Borrar producto por código
    private static void borrarProducto() {
        System.out.print("Código del producto a borrar: ");
        String codigo = sc.nextLine();

        if (productos.remove(codigo) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("No existe un producto con ese código.");
        }
    }
}
