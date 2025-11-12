import java.util.Scanner;

public class Tema3_Ejercicio_9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operaciones = 0;
        double num1;
        double num2;
        double resultado = 0;
        boolean error = false;
        int factorial = 0;

        System.out.println("Elige qué operación hacer: \n 1 - Suma \n 2 - Resta \n 3 - Multiplicación \n 4 - División \n 5 - Potencia \n 6 - Raíz cuadrada \n 7 - Facltorial.");
        operaciones = sc.nextInt();

        switch (operaciones) {
            case 1:
                System.out.println("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                System.out.println("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 3:
                System.out.println("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 4:
                System.out.println("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                if (num2 == 0) {
                    System.out.println("No puedes dividir entre cero.");
                    error = true;
                } else {
                    resultado = num1 / num2;
                }
                System.out.println("El resultado es: " + resultado);
                break;
            case 5:
                System.out.println("Introduce el número base: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el exponente: ");
                num2 = sc.nextDouble();
                if (num2 < 0) {
                    System.out.println("El exponente NO puede ser negativo.");
                    error = true;
                } else
                    resultado = Math.pow(num1, num2);
                System.out.println("El resultado es: " + resultado);
                break;
            case 6:
                System.out.println("Introduce el primer número: ");
                num1 = sc.nextDouble();
                if (num1 < 0) {
                    System.out.println("El valor NO puede ser negativo.");
                    error = true;
                } else {
                    resultado = Math.sqrt(num1);
                }
                System.out.println("El resultado es: " + resultado);
                break;
            case 7:
                System.out.print("Introduce el número: ");
                num1 = sc.nextInt();
                if (num1 < 0) {
                    System.out.println("Error: No se puede calcular el factorial de un número negativo.");
                    error = true;
                } else {
                     factorial = 1;
                    for (int i = 1; i <= num1; i++) {
                        factorial *= i;
                    }
                    System.out.println("El factorial de " + (int) num1 + " es " + factorial);
                    error = true;
                }
        }
    }
}

