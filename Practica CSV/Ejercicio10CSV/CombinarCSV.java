package Ejercicio10CSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CombinarCSV {
    public static void main(String[] args) {
        String archivo1 = "./datos1.csv";
        String archivo2 = "./datos2.csv";
        String destino = "combinado.csv";

        Set<String> lineasUnicas = new HashSet<>();

        // Leer primer archivo
        leerArchivo(archivo1, lineasUnicas);
        // Leer segundo archivo
        leerArchivo(archivo2, lineasUnicas);

        // Escribir combinado sin duplicados
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
            for (String linea : lineasUnicas) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Archivo 'combinado.csv' generado sin duplicados.");
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
    }

    private static void leerArchivo(String archivo, Set<String> lineasUnicas) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasUnicas.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer " + archivo + ": " + e.getMessage());
        }
    }
}
