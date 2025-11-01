import java.util.Scanner;

public class Tema4_Ejercicio_15 {
    public static void main(String[] args) {
        // Introducción
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int num_copiado;
        int contador = 0;
        // Desarrollo
        System.out.println("Introduce un número entero: ");
        numero = sc.nextInt();
        num_copiado = numero;

        if (num_copiado < 0){
            num_copiado = -num_copiado;
        }
        if (num_copiado == 0){
            contador = 1;
        } else {
            while (num_copiado > 0){
                num_copiado = num_copiado / 10;
                contador++;
            }
        }
        // Desenlace
        System.out.println("El número " + numero + " tiene " + contador + " dígitos en total.");
    }
}
