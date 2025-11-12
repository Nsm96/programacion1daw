import java.util.Scanner;

public class Tema4_Ejercicio_1 {
    // Introducción
    static void main() {
        Scanner sc = new Scanner(System.in);
        String cadena;
        char cantidad;
        int contador = 0;
    // Desarrollo
        System.out.println("Introduce una cadena: ");
        cadena = sc.nextLine().trim();

        for (int i = 0; i < cadena.length(); i++) {
            cantidad = cadena.charAt(1);
            contador++;

        }
    // Desenlace
        System.out.println("Esta cadena tiene " + contador + " caracteres.");

    }
}
