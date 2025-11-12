import java.util.Scanner;

public class Tema4_Ejercicio_7 {
    static void main() {
        // Introducción
        Scanner sc = new Scanner(System.in);
        int numero;
        // Desarrollo
        System.out.println("Introduce un número hasta el que quieras contar: ");
        numero = sc.nextInt();
        for (int i = 0; i < numero;){
            i++;
            System.out.println(i);
        }
        // Desenlace
        System.out.println("Fin del contador.");
    }

}
