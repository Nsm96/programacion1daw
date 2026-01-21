package ArchivosTXT;

import java.io.*;

public class Ejercicio7txt {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo3.txt"))) {
            String[] archivos = {"archivo1.txt", "archivo2.txt"};
            for (String nombre : archivos) {
                try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        bw.write(linea);
                        bw.newLine();
                    }
                }
            }
            System.out.println("Contenidos añadidos en 'archivo3.txt'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
