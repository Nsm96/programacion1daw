import java.util.Scanner;

public class Tema3_Ejercicio_10 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        double cal1, cal2, cal3, cal4, cal5, cal6;
        double peso1, peso2, peso3, peso4, peso5, peso6;
        double suma_de_pesos, promedio_ponderado;

        System.out.print("Introduce la nota de la materia 1: ");
        cal1 = sc.nextDouble();
        System.out.print("Introduce el peso porcentual de la materia 1: ");
        peso1 = sc.nextDouble();

        System.out.print("Introduce la nota de la materia 2: ");
        cal2 = sc.nextDouble();
        System.out.print("Introduce el peso porcentual de la materia 2: ");
        peso2 = sc.nextDouble();

        System.out.print("Introduce la nota de la materia 3: ");
        cal3 = sc.nextDouble();
        System.out.print("Introduce el peso porcentual de la materia 3: ");
        peso3 = sc.nextDouble();

        System.out.print("Introduce la nota de la materia 4: ");
        cal4 = sc.nextDouble();
        System.out.print("Introduce el peso porcentual de la materia 4: ");
        peso4 = sc.nextDouble();

        System.out.print("Introduce la nota de la materia 5: ");
        cal5 = sc.nextDouble();
        System.out.print("Introduce el peso porcentual de la materia 5: ");
        peso5 = sc.nextDouble();

        System.out.print("Introduce la nota de la materia 6: ");
        cal6 = sc.nextDouble();
        System.out.print("Introduce el peso porcentual de la materia 6: ");
        peso6 = sc.nextDouble();

        suma_de_pesos = peso1 + peso2 + peso3 + peso4 + peso5 + peso6;

        if (suma_de_pesos != 100) {
            System.out.println("Error: La suma de los pesos debe ser exactamente 100%.");
        } else {
            promedio_ponderado = cal1 * (peso1 / 100) + cal2 * (peso2 / 100) + cal3 * (peso3 / 100)
                    + cal4 * (peso4 / 100) + cal5 * (peso5 / 100) + cal6 * (peso6 / 100);

            System.out.printf("El promedio ponderado es: %.2f%%\n", promedio_ponderado);

            if (promedio_ponderado < 60) {
                System.out.println("El usuario ha reprobado.");
            } else {
                System.out.println("El usuario ha aprobado.");
            }
        }
        sc.close();
    }
}
