import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre a buscar: ");
        String buscado = sc.nextLine().trim();

        if (nombres.contains(buscado)) {
            System.out.println("El nombre existe en el conjunto.");
        } else {
            System.out.println("El nombre NO existe.");
        }

        sc.close();
    }
}
