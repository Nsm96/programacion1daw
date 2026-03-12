import java.util.*;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();
        nombres.add("Nico");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");

        List<String> lista = new ArrayList<>(nombres);
        Collections.sort(lista);

        for (String n : lista) {
            System.out.println(n);
        }
    }
}
