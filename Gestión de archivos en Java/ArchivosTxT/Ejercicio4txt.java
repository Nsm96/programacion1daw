package ArchivosTXT;
import java.io.*;
import java.util.Scanner;

public class Ejercicio4txt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un texto para añadir:");
        String texto = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo1.txt", true))) {
            bw.newLine();
            bw.write(texto);
            System.out.println("Texto añadido.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
