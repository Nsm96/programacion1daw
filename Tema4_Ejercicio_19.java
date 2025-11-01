import java.util.Random;

public class Tema4_Ejercicio_19 {
    public static void main(String[] args) {
        // Introducción

        Random rand = new Random();
        int suma = 0;
        int cantidad = 10;
        // Desarrollo

        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidad; i++) {
            int numero = rand.nextInt(100) + 1;
            System.out.print(numero + " ");
            suma += numero;
        }
        System.out.println();
        double media = (double) suma / cantidad;
        // Desenlace

        System.out.println("La media de los números generados es: " + media);
    }
}
