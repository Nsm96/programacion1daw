import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP_Ejercicio_5 {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");

        Scanner sc = new Scanner(System.in);
        System.out.print("Palabra en español: ");
        String palabra = sc.nextLine().toLowerCase();

        if (diccionario.containsKey(palabra)) {
            System.out.println("Traducción: " + diccionario.get(palabra));
        } else {
            System.out.println("La palabra no está en el diccionario.");
        }

        sc.close();
    }
}
