import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primera palabra: ");
        String p1 = sc.nextLine().toLowerCase();

        System.out.print("Segunda palabra: ");
        String p2 = sc.nextLine().toLowerCase();

        char[] a1 = p1.toCharArray();
        char[] a2 = p2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean sonAnagramas = Arrays.equals(a1, a2);

        if (sonAnagramas) {
            System.out.println("Son anagramas.");
        } else {
            System.out.println("NO son anagramas.");
        }

        sc.close();
    }
}
