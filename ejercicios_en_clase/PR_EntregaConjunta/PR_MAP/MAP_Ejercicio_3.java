import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP_Ejercicio_3 {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        agenda.put("Ana", "600111222");
        agenda.put("Luis", "600333444");

        System.out.print("Nombre nuevo contacto: ");
        String nombreNuevo = sc.nextLine();
        System.out.print("Teléfono: ");
        String telNuevo = sc.nextLine();
        agenda.put(nombreNuevo, telNuevo);

        System.out.print("Nombre a buscar: ");
        String nombreBuscar = sc.nextLine();
        String telefono = agenda.get(nombreBuscar);
        if (telefono != null) {
            System.out.println("Teléfono de " + nombreBuscar + ": " + telefono);
        } else {
            System.out.println("No existe ese contacto.");
        }

        System.out.println("Agenda completa:");
        for (String nombre : agenda.keySet()) {
            System.out.println(nombre + " -> " + agenda.get(nombre));
        }

        sc.close();
    }
}
