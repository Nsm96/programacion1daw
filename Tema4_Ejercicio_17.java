import java.util.Random;
import java.util.Scanner;

public class Tema4_Ejercicio_17 {
    static void main() {
        // Introducción
        Scanner sc = new Scanner(System.in);
        Random rng = new Random ();
        int numero_usuario = 0;
        int numero_aleatorio = rng.nextInt(10)+1;
        // Desarrollo
        while (numero_usuario != numero_aleatorio) {
            System.out.println("¿Qué número crees que es? (del 1 al 10): ");
            numero_usuario = sc.nextInt();
            if (numero_usuario > 10 || numero_usuario < 1){
                System.out.println("¡El número no puede ser mayor que 100 ni menor que 1!");
            } else if (numero_usuario == numero_aleatorio){
                System.out.println("¡Lo has adivinado!");
            }  else {
                System.out.println("¡No! vuelve a intentarlo...");
            }
        }
        // Desenlace
        System.out.println("Fin del programa.");
    }
}
