import java.util.Scanner;

public class Tema3_Ejercicio_8 {
    static void main() {
        Scanner sc = new Scanner (System.in);
        int numero;
        int suma = 0;
        System.out.println("Introduce un número: ");
        numero = sc.nextInt();


        if (numero < 0) {
            System.out.println("Los números perfectos NO pueden ser negativos.");
        }

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
            if (suma == numero) {
                System.out.println(numero + " es un número perfecto.");
            } else {
                System.out.println(numero + " no es un número perfecto");
            }
        }
    }




