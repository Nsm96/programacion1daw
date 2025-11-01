import java.util.Scanner;

public class Tema4_Ejercicio_12 {
   public static void main() {
        // Introducción
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int menu = 0;
        String cadena, invertir = "";
        char cantidad;

        int contador = 0;
        // Desarrollo
        do {
            System.out.println("Elige qué quieres hacer (1-3): ");
            System.out.println("1. Contar caracteres.");
            System.out.println("2. Invertir caracteres.");
            System.out.println("3. Salir");

            while (!sc.hasNextInt()) {
                System.out.println("POr favor ingresa una opción válida.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: Contar caracteres.");
                    System.out.println("Introduce una cadena: ");
                    cadena = sc.nextLine().trim();

                    for (int i = 0; i < cadena.length(); i++) {
                        cantidad = cadena.charAt(i);
                        contador++;
                    }
                    System.out.println("Esta cadena tiene " + contador + " caracteres.");
                    break;
                case 2:
                    System.out.println("Introduce una cadena: ");
                    cadena = sc.next();
                    invertir = "";

                    for (int i = cadena.length() - 1; i >= 0; i--) {
                        invertir += cadena.charAt(i);
                    }
                    System.out.println("La cadena invertida es: " + invertir);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (opcion !=3);
    }
}
