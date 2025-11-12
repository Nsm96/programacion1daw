import java.util.Scanner;

public class Tema4_Ejercicio_16 {
    public static void main(String[] args) {
        // Introducción

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        int suma = 0;
        int num_copiado = numero;
        // Desarrollo

        if (num_copiado < 0) {
            num_copiado = -num_copiado; //
        }
        while (num_copiado > 0) {
            int digito = num_copiado % 10;
            suma += digito;
            num_copiado /= 10;
        }
        // Desenlace

        System.out.println("La suma de los dígitos " + numero + " es: " + suma);
        sc.close();
    }
}

