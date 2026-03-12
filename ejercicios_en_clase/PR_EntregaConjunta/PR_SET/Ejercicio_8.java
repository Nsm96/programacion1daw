import java.util.Set;
import java.util.TreeSet;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(5);

        System.out.println("Antes de vaciar, tamaño: " + numeros.size());

        numeros.clear();

        if (numeros.isEmpty()) {
            System.out.println("El TreeSet está vacío.");
        } else {
            System.out.println("El TreeSet NO está vacío.");
        }
    }
}
