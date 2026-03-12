import java.util.HashSet;
import java.util.Set;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new HashSet<>();
        conjunto1.add("Ana");
        conjunto1.add("Luis");
        conjunto1.add("María");

        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("Luis");
        conjunto2.add("Carlos");
        conjunto2.add("María");

        Set<String> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);

        System.out.println("Elementos comunes:");
        for (String elem : interseccion) {
            System.out.println(elem);
        }
    }
}
