import java.util.Scanner;

public class Tema4_Ejercicio_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String cadena;
        String invertir = "";

        System.out.println("Introduce una cadena: ");
        cadena = sc.next();

        for (int i = cadena.length() - 1; i >= 0; i--){
            invertir += cadena.charAt(i);
        }
        System.out.println("La cadena invertida es: " + invertir);
    }
}
