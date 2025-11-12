import java.util.Scanner;

public class Tema4_ejercicio_5 {
    static void main() {
        String cadena = "", invertir = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto.");
        cadena = sc.next();

        for (int i = cadena.length() -1; i >= 0; i--) {
            invertir = invertir + cadena.charAt(i);
        }
        if (cadena.equals(invertir)){
            System.out.println(cadena + " Es un palindromo.");
        } else {
            System.out.println(cadena + " No es un palindromo");
        }


    }
}
