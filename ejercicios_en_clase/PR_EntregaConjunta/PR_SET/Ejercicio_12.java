import java.util.*;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Set<Integer> numeros = new LinkedHashSet<>();
        Random rand = new Random();

        while (numeros.size() < 10) {
            int n = rand.nextInt(20) + 1;
            numeros.add(n);
        }

        System.out.println("Números (sin duplicados, orden inserción):");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
