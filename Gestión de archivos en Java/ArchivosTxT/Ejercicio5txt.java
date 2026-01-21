package ArchivosTXT;

import java.io.*;

public class Ejercicio5txt {
    public static void main(String[] args) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"))) {
            while (br.readLine() != null) {
                contador++;
            }
            System.out.println("Líneas totales: " + contador);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
