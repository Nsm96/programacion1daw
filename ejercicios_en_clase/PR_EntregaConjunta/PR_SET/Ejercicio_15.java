import java.util.HashSet;
import java.util.Set;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        Set<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");

        Set<String> soloSet1 = new HashSet<>(set1);
        soloSet1.removeAll(set2);

        Set<String> soloSet2 = new HashSet<>(set2);
        soloSet2.removeAll(set1);

        System.out.println("Exclusivos de set1: " + soloSet1);
        System.out.println("Exclusivos de set2: " + soloSet2);
    }
}
