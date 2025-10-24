import java.util.Scanner;

public class Ejercicio_5 {
    static void main() {
        // Introducción
        Scanner sc = new Scanner(System.in);
        double lado1;
        double lado2;
        double lado3;
        // Desarrollo
        System.out.println("Introduce la longitud del lado 1: ");
        lado1 = sc.nextDouble();
        System.out.println("Introduce la longitud del lado 2: ");
        lado2 = sc.nextDouble();
        System.out.println("Introduce la longitud del lado 3:");
        lado3 = sc.nextDouble();
        // Desenlace
        if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)) {
        } else {
            System.out.println("No es un triángulo");
            return;
        }
        if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
            System.out.println("Es un triángulo equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Es un triángulo isósceles.");
        } else if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Longitudes incorrectas, los valores no pueden ser 0 o menor a 0");
        } else {
            System.out.println("Es un triángulo escaleno.");
        }
    }
}



