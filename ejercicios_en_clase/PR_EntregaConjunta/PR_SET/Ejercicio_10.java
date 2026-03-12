import java.util.*;

public class Ejercicio_10 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList(
                "rojo", "azul", "rojo", "verde", "azul", "amarillo"
        );

        Set<String> unicos = new HashSet<>(lista);

        System.out.println("Elementos únicos: " + unicos.size());
        System.out.println("Son: " + unicos);
    }
}
