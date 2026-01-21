package ArchivosTXT;

import java.io.*;

public class Ejercicio2txt {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
