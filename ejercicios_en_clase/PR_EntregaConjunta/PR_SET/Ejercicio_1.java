import java.util.HashSet;
import java.util.Set;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Nico");

        for (String n : nombres) {
            System.out.println(n);
        }
    }
}
