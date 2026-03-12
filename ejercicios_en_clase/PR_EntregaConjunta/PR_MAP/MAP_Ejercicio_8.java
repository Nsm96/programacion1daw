import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP_Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> conteo = new HashMap<>();

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (conteo.containsKey(c)) {
                conteo.put(c, conteo.get(c) + 1);
            } else {
                conteo.put(c, 1);
            }
        }

        for (Character c : conteo.keySet()) {
            System.out.println(c + " -> " + conteo.get(c));
        }

        sc.close();
    }
}
