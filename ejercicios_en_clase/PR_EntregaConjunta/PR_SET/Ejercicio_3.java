import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> palabras = new LinkedHashSet<>();

        System.out.println("Introduce palabras (Salir para terminar):");
        String palabra;
        do {
            palabra = sc.nextLine();
            if (!palabra.equalsIgnoreCase("salir")) {
                palabras.add(palabra);
            }
        } while (!palabra.equalsIgnoreCase("salir"));

        for (String p : palabras) {
            System.out.println(p);
        }

        sc.close();
    }
}
