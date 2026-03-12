import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP_Ejercicio_7 {
    public static void main(String[] args) {
        Map<String, Integer> inventario = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del producto a agregar: ");
        String prod = sc.nextLine();
        System.out.print("Cantidad: ");
        int cant = Integer.parseInt(sc.nextLine());
        inventario.put(prod, cant);

        System.out.print("Producto a actualizar: ");
        String prodAct = sc.nextLine();
        if (inventario.containsKey(prodAct)) {
            System.out.print("Nueva cantidad: ");
            int nuevaCant = Integer.parseInt(sc.nextLine());
            inventario.put(prodAct, nuevaCant);
        } else {
            System.out.println("Ese producto no existe.");
        }

        System.out.print("Producto a eliminar: ");
        String prodElim = sc.nextLine();
        inventario.remove(prodElim);

        System.out.println("Inventario actual:");
        for (String nombre : inventario.keySet()) {
            System.out.println(nombre + " -> " + inventario.get(nombre));
        }

        sc.close();
    }
}
