import java.util.Set;
import java.util.TreeSet;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Set<Integer> conjuntoA = new TreeSet<>();
        conjuntoA.add(1);
        conjuntoA.add(2);
        conjuntoA.add(3);
        conjuntoA.add(4);

        Set<Integer> conjuntoB = new TreeSet<>();
        conjuntoB.add(2);
        conjuntoB.add(3);

        boolean esSubconjunto = conjuntoA.containsAll(conjuntoB);

        if (esSubconjunto) {
            System.out.println("B es subconjunto de A");
        } else {
            System.out.println("B NO es subconjunto de A");
        }
    }
}
