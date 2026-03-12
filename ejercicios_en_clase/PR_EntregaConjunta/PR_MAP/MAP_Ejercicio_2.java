import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> frecuencias = new HashMap<>();

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine().toLowerCase();

        String[] palabras = frase.split("\\s+");

        for (String p : palabras) {
            if (p.isEmpty()) continue;
            if (frecuencias.containsKey(p)) {
                frecuencias.put(p, frecuencias.get(p) + 1);
            } else {
                frecuencias.put(p, 1);
            }
        }

        for (String palabra : frecuencias.keySet()) {
            System.out.println(palabra + " -> " + frecuencias.get(palabra));
        }

        sc.close();
    }
}
