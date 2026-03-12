import java.util.HashSet;
import java.util.Set;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Set<String> original = new HashSet<>();
        original.add("A");
        original.add("B");
        original.add("C");

        Set<String> copia = new HashSet<>(original);

        System.out.println("Original: " + original);
        System.out.println("Copia: " + copia);
    }
}
