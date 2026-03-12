import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MAP_Ejercicio_9 {
    public static void main(String[] args) {
        Map<String, String> empleados = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("ID del empleado: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Salario: ");
        String salario = sc.nextLine();

        empleados.put(id, nombre + " - " + salario);

        System.out.print("ID a buscar: ");
        String idBuscar = sc.nextLine();
        String datos = empleados.get(idBuscar);
        if (datos != null) {
            System.out.println("Empleado: " + datos);
        } else {
            System.out.println("No existe ese ID.");
        }

        System.out.println("Listado de empleados:");
        for (String clave : empleados.keySet()) {
            System.out.println(clave + " -> " + empleados.get(clave));
        }

        sc.close();
    }
}
