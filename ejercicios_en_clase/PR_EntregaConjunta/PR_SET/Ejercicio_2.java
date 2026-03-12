import java.util.Set;
import java.util.TreeSet;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
