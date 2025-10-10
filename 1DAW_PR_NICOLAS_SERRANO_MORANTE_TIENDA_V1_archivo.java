import java.util.Random;
import java.util.Scanner;

public class tienda_nico {


    static void main() {
        // Bienvenida
        System.out.println("Bienvenido a la tienda de Nico \n" +
                "███╗   ██╗██╗ ██████╗ ██████╗     ███████╗██╗  ██╗ ██████╗ ██████╗ \n" +
                "████╗  ██║██║██╔════╝██╔═══██╗    ██╔════╝██║  ██║██╔═══██╗██╔══██╗\n" +
                "██╔██╗ ██║██║██║     ██║   ██║    ███████╗███████║██║   ██║██████╔╝\n" +
                "██║╚██╗██║██║██║     ██║   ██║    ╚════██║██╔══██║██║   ██║██╔═══╝ \n" +
                "██║ ╚████║██║╚██████╗╚██████╔╝    ███████║██║  ██║╚██████╔╝██║     \n" +
                "╚═╝  ╚═══╝╚═╝ ╚═════╝ ╚═════╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝     \n" +
                "                                                                   ");
        // Introducción
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
            int descuento = random.nextInt (6) +5;
            double iva = 21;
        String samsung = "Samsung S23";
        String xiaomi = "Xiaomi Note 13";
        String iPhone = "iPhone 16 pro";
        String googlepixel = "Google Pixel One";
        String nothingphone = "Nothing Phone 3";
            double precio1 = 515.79;
            double precio2 = 149.59;
            double precio3 = 1099.99;
            double precio4 = 658.86;
            double precio5 = 385.90;
        String nombre_cliente = "";
        String apellido_cliente = "";
        String segundo_apellido_cliente = "";
            int pedidos_samsung, pedidos_xiaomi, pedidos_iphone, pedidos_googlepixel, pedidos_nothing;
        // ============================================== //

        // Desarrollo
            double iva_samsung = precio1 * (iva / 100);
            double total_samsung = precio1 + iva_samsung;
            double iva_xiaomi = precio2 * (iva / 100);
            double total_xiaomi = precio2 + iva_xiaomi;
            double iva_iphone = precio3 * (iva / 100);
            double total_iphone = precio3 + iva_iphone;
            double iva_pixel = precio4 * (iva / 100);
            double total_pixel = precio4 + iva_pixel;
            double iva_nothing = precio5 * (iva / 100);
            double total_nothing = precio5 + iva_nothing;
        // Datos  del usuario
        System.out.println("Introduzca su nombre: ");
            nombre_cliente = sc.next();
        System.out.println("Introduzca su primer apellido: ");
            apellido_cliente = sc.next();
        System.out.println("Introduzca su segundo apellido");
            segundo_apellido_cliente = sc.next();

        // ============================================== //
        System.out.println("El precio de " + samsung + " es de " + String.format("%.2f", total_samsung) + " €.");
        System.out.println("El precio de " + xiaomi + " es de " + String.format("%.2f", total_xiaomi) + " €.");
        System.out.println("El precio de " + iPhone + " es de " + String.format("%.2f", total_iphone) + " €.");
        System.out.println("El precio de " + googlepixel + " es de " + String.format("%.2f", total_pixel) + " €.");
        System.out.println("El precio de " + nothingphone + " es de " + String.format("%.2f", total_nothing) + " €.");
        // ============================================== //

        // Lo que va a pedir el usuario
        System.out.println("¿Cuántos Samsung S23 desea?: ");
            pedidos_samsung = sc.nextInt();
        System.out.println("¿Cuántos Xiaomi Note 13 desea?: ");
            pedidos_xiaomi = sc.nextInt();
        System.out.println("¿Cuantos iPhone 16 pro desea? ");
            pedidos_iphone = sc.nextInt();
        System.out.println("¿Cuántos Google Pixel One desea?: ");
            pedidos_googlepixel = sc.nextInt();
        System.out.println("¿Cuántos Nothing Phone 3 desea? ");
            pedidos_nothing = sc.nextInt();

        // Factura y final
        System.out.println("Sr/Sra " + nombre_cliente + " aquí tiene el resumen de su factura: ");
        System.out.println("Nombre cliente: " + nombre_cliente.toUpperCase() + " " + apellido_cliente.toUpperCase() + " " + segundo_apellido_cliente.toUpperCase());
        System.out.println("Productos:");
        System.out.println("Samsung Galaxy S23: " + pedidos_samsung);
        System.out.println("Xiaomi note 13: " + pedidos_xiaomi);
        System.out.println("iPhone 16 pro: " + pedidos_iphone);
        System.out.println("Google Pixel One: " + pedidos_googlepixel);
        System.out.println("Nothing Phone 3: " + pedidos_nothing);
            double precio_total_siniva = precio1 * pedidos_samsung + precio2 * pedidos_xiaomi + precio3 * pedidos_iphone + precio4 * pedidos_googlepixel + precio5 * pedidos_nothing;
        System.out.println("Total a pagar:");
        System.out.println("Total sin IVA: " + precio_total_siniva + " €");
        System.out.println("IVA aplicado: " + iva + "%");
            double precio_total_coniva = total_samsung * pedidos_samsung + total_xiaomi * pedidos_xiaomi + total_iphone * pedidos_iphone + total_pixel * pedidos_googlepixel + total_nothing * pedidos_nothing;
        System.out.println("Total con IVA: " + String.format("%.2f", precio_total_coniva) + " €");
        System.out.println("Descuento por primera compra: " + descuento + " %");
            double total_a_pagar = precio_total_coniva - (precio_total_coniva * descuento / 100);
        System.out.println("El total a pagar con descuento e IVA es: " + String.format("%.2f", total_a_pagar) + " €.");

        // Despedida
        if (total_a_pagar == 0) {
            System.out.println("Gracias por su...¿visita? (no) vuelva pronto..."); // Por si no compran... ¡tacaños!
            } else {
                System.out.println("¡Gracias por tu compra! ¡Vuelve pronto!");
        }
    }
}