package ArchivosTXT;

import java.io.*;
import java.util.Scanner;

public class Ejercicio8txt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Buscar la palabra: ");
        String buscada = sc.next();
        int total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(buscada)) total++;
            }
            System.out.println("La palabra '" + buscada + "' aparece en " + total + " líneas.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
