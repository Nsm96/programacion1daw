import java.util.HashSet;
import java.util.Set;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new HashSet<>();
        conjunto1.add("Ana");
        conjunto1.add("Luis");
        conjunto1.add("María");

        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("Luis");
        conjunto2.add("Carlos");
        conjunto2.add("Pedro");

        Set<String> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);

        System.out.println("Conjunto combinado (sin duplicados):");
        for (String elem : union) {
            System.out.println(elem);
        }
    }
}
