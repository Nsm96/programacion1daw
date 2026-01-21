package Ejercicio8CSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FiltroAdultosCSV {
    public static void main(String[] args) {
        String origen = "datos.csv";  // Archivo CSV existente
        String destino = ".//   adultos.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {

            String linea;
            boolean primeraLinea = true;  // Para manejar cabecera opcional

            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length >= 2) {
                    try {
                        int edad = Integer.parseInt(campos[1].trim().replace("\"", ""));
                        if (edad >= 18) {
                            if (!primeraLinea) {
                                bw.newLine();
                            }
                            bw.write(linea);
                            primeraLinea = false;
                        }
                    } catch (NumberFormatException e) {
                        // Salta líneas con edad inválida
                        System.err.println("Edad inválida: " + linea);
                    }
                }
            }
            System.out.println("Archivo 'adultos.csv' generado.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
