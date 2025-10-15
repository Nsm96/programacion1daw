import java.util.Scanner;
public class Ejercicio_4 {
    void main() {
        // Introducción
        Scanner sc = new Scanner(System.in);
        int mes;
        int dia;
        int anio;
        int dias_del_mes;
        boolean bisiesto = false;
        // Nudo
        System.out.println("Introduce el día: ");
        dia = sc.nextInt();
        System.out.println("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        anio = sc.nextInt();

        // Desarrollo
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                dias_del_mes = 31;
                break;
            case 4, 6, 9, 11:
                dias_del_mes = 30;
            case 2:
                if (bisiesto) {
                    dias_del_mes = 29;
                } else {
                    dias_del_mes = 28;
                }
                break;
            default:
                dias_del_mes = -1;
        }
        // Desenlace
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            bisiesto = true;
        }
        if (mes >= 1 && mes <= 12 && dias_del_mes != -1 && dia >= 1 && dia <= dias_del_mes) {
            System.out.println("La fecha es válida");
        } else if (bisiesto && dias_del_mes <= 31) {
            System.out.println("La fecha no es válida.");
        }

    }
}
