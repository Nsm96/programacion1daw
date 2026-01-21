package ArchivosTXT;

import java.io.*;
import java.util.Scanner;

public class Ejercicio6txt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nuevo texto:");
        String texto = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo1.txt"))) {
            bw.write(texto);
            System.out.println("Contenido sobrescrito.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
