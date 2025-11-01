import java.util.Scanner;
public class Tema4_Ejercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if ( (c >= 'a' && c <= 'z') && "aeiou".indexOf(c) == -1 ) {
                contador++; // Es consonante
            }
        }

        System.out.println("La cadena tiene " + contador + " consonantes.");
        sc.close();
    }
}
