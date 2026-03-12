import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Carlos");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre a eliminar: ");
        String eliminar = sc.nextLine();

        if (nombres.remove(eliminar)) {
            System.out.println("Eliminado correctamente.");
        } else {
            System.out.println("No estaba en el conjunto.");
        }

        System.out.println("Contenido restante:");
        for (String n : nombres) {
            System.out.println(n);
        }

        sc.close();
    }
}
