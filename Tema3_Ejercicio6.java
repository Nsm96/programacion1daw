import java.util.Scanner;

public class Tema3_Ejercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double cinco_porciento = 5;
        double diez_porciento = 10;
        double quince_porciento = 15;
        double veinte_porciento = 20;
        double veinticinco_porciento = 25;
        double treinta_porciento = 30;
        double ingresos_usuario;
        int cantidad_dependientes;
        double porcentaje;
        double total_a_pagar;
        System.out.println("Ingresa el número de dependientes que tienes: ");
        cantidad_dependientes = sc.nextInt();
        System.out.println("Introduce tus ingresos anuales: ");
        ingresos_usuario = sc.nextDouble();

        if (ingresos_usuario <= 20000 && cantidad_dependientes < 3) {
                porcentaje = ingresos_usuario * cinco_porciento / 100;
                total_a_pagar = porcentaje;
                System.out.println("Tienes que pagar un 5% de impuestos, tendrás que pagar: " + (int)total_a_pagar + " €.");
            } else if (ingresos_usuario > 20000 && ingresos_usuario <= 40000 && cantidad_dependientes < 3) {
                porcentaje = ingresos_usuario * diez_porciento / 100;
                total_a_pagar = porcentaje;
                System.out.println("Tienes que pagar un 10% de impuestos, tendrás que pagar: " + (int)total_a_pagar + " €.");
            } else if (ingresos_usuario >= 40000 && ingresos_usuario <= 80000 && cantidad_dependientes < 3) {
                porcentaje = ingresos_usuario * veinte_porciento / 100;
                total_a_pagar = porcentaje;
                System.out.println("Tienes que pagar un 20% de impuestos, tendrás que pagar: " + (int)total_a_pagar + " €.");
            } else if (ingresos_usuario >= 80000 && cantidad_dependientes <3) {
                porcentaje = ingresos_usuario * treinta_porciento / 100;
                total_a_pagar = porcentaje;
                System.out.println("Tienes que pagar un 30% de impuestos, tendrás que pagar: " + (int)total_a_pagar + " €.");
            } else if (cantidad_dependientes > 3 && ingresos_usuario <= 20000){
            System.out.println("Debido a que usted tiene más de 3 dependientes, su porcentaje a pagar es de 0% en impuestos.");
        } else if (cantidad_dependientes > 3 && ingresos_usuario > 20000 && ingresos_usuario <=40000){
            porcentaje = ingresos_usuario * cinco_porciento / 100;
            total_a_pagar = porcentaje;
            System.out.println("Debido a que usted tiene más de 3 dependientes pagará un 5% en vez de un 10% de impuestos, va a pagar: " + (int)total_a_pagar + " €.");
        } else if (cantidad_dependientes > 3 && ingresos_usuario >=40000 && ingresos_usuario <=80000){
            porcentaje = ingresos_usuario * quince_porciento / 100;
            total_a_pagar = porcentaje;
            System.out.println("Debido a que usted tiene más de 3 dependientes pagará un 15% en vez de un 20% de impuestos, va a pagar: " + (int)total_a_pagar + " €.");
        } else if ( cantidad_dependientes > 3 && ingresos_usuario > 80000){
            porcentaje = ingresos_usuario * veinticinco_porciento / 100;
            total_a_pagar = porcentaje;
            System.out.println("Debido a que usted tiene más de 3 dependientes pagará un 25% en vez de un 30% de impuestos, va a pagar: " + (int)total_a_pagar + " €.");
        }
        }
    }
