import java.util.Scanner;

public class Tema4_Ejercicio_9 {
    static void main() {
        // Introducción
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        // Desarrollo
        System.out.println("Introduce un número");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                suma += i;
            }

        }
        // Desenlace
        System.out.println("La suma de los pares hasta el número " + numero + " es: " + suma);
    }
}
