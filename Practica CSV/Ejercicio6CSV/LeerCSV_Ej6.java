package Ejercicio6CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCSV_Ej6 {
    public static void parsearCSV(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            int contador = 0;

            System.out.println("Datos parseados del CSV:");
            while ((linea = br.readLine()) != null) {
                contador++;

                // Saltar cabecera si existe (línea 1)
                if (contador == 1 && linea.startsWith("nombre")) {
                    continue;
                }

                // Separar por comas (maneja comillas básicas)
                String[] campos = linea.split(",");

                if (campos.length >= 3) {
                    String nombre = campos[0].replace("\"", "").trim();
                    String edad = campos[1].trim();
                    String ciudad = campos[2].replace("\"", "").trim();

                    System.out.printf("Línea %d - Nombre: %s, Edad: %s, Ciudad: %s%n",
                            contador, nombre, edad, ciudad);
                } else {
                    System.out.println("Línea " + contador + " incompleta: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer CSV: " + e.getMessage());
        }
    }
}
