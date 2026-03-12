import java.util.*;

public class MAP_Ejercicio_4 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList(
                "Ana", "Luis", "Ana", "María", "Luis", "Ana"
        );

        Map<String, Integer> conteo = new HashMap<>();

        for (String n : nombres) {
            if (conteo.containsKey(n)) {
                conteo.put(n, conteo.get(n) + 1);
            } else {
                conteo.put(n, 1);
            }
        }

        for (String nombre : conteo.keySet()) {
            System.out.println(nombre + " aparece " + conteo.get(nombre) + " veces");
        }
    }
}
