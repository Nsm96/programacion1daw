import java.util.Random;
import java.util.Scanner;
public class Tema4_Ejercicio_4 {
    public static void main(String[] args) {
        // Introducción
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // Desarrollo
        System.out.print("Introduce la longitud de la cadena: ");
        int n = sc.nextInt();
        sc.nextLine();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String cadena = "";

        for (int i = 0; i < n; i++) {
            int indice = rand.nextInt(caracteres.length());
            cadena += caracteres.charAt(indice);
        }
        // Desenlace
        System.out.println("Cadena aleatoria generada: " + cadena);
    }
}
