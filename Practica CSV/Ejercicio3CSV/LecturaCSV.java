package Ejercicio3CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaCSV {
    private String archivo;

    public LecturaCSV(String archivo) {
        this.archivo = archivo;
    }

    public void leerArchivo() {
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            System.out.println("El archivo contiene:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}
