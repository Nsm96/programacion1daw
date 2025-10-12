import java.util.Scanner;

public class Ejercicio_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double descuento_regular = 5;
        double descuento_premium = 10;
        double descuento_vip = 20;
        double descuento_vip_directo = 25;
        double precio_producto;
        String tipo_cliente = "";
        double precio_con_descuento;
        double precio_con_descuento2;
        double precio_con_descuento3;
        double precio_total_regular;
        double precio_total_premium;
        double precio_total_vip;
        double bonus_vip; // el 5% extra para los de más de 500€
        double total_vip_directo;


        System.out.println("Indica el tipo de cliente que eres (Regular, Premium o VIP): ");
        tipo_cliente = sc.nextLine();
        System.out.println("Introduce el precio del producto: ");
        precio_producto = sc.nextDouble();

        if (precio_producto > 500) {
            System.out.println("¡Enhorabuena! Usted ha indicado un producto de más de 500€ lo que le convierte automáticamente en cliente VIP con un bonus de 5% extra de descuento.");
            bonus_vip = precio_producto * (descuento_vip_directo / 100);
            total_vip_directo = precio_producto - bonus_vip;
            System.out.println("El precio del producto para el cliente VIP y un 5% extra por cantidad superior a 500€ es: " + total_vip_directo);

        } else if(tipo_cliente.equals("regular")) {
            precio_con_descuento = precio_producto * (descuento_regular / 100);
            precio_total_regular = precio_producto - precio_con_descuento;
            System.out.println("El precio del producto con el descuento de cliente regular es: " + precio_total_regular + " €.");

        } else if (tipo_cliente.equals("premium")) {
            precio_con_descuento2 = precio_producto * (descuento_premium / 100);
            precio_total_premium = precio_producto - precio_con_descuento2;
            System.out.println("El precio del producto con el descuento de cliente premium es: " + precio_total_premium + " €.");
        } else if (tipo_cliente.equals("vip")) {
            precio_con_descuento3 = precio_producto * (descuento_vip / 100);
            precio_total_vip = precio_producto - precio_con_descuento3;
            System.out.println("El precio del producto con el descuento de cliente VIP es: " + precio_total_vip + " €.");
        } else
            System.out.println("No ha indicado ningún tipo de cliente válido.");
    }
}

