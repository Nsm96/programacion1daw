package ArchivosTXT;
import java.io.*;
import java.util.Scanner;

public class Ejercicio1txt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el texto que quieres añadir: ");
        String texto = sc.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("archivo1.txt"))) {
            writer.write(texto);
            System.out.println("Archivo 'archivo1.txt' creado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}


