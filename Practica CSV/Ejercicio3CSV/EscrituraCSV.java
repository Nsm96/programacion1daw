package Ejercicio3CSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraCSV {
    private String archivo;
    private Scanner scanner;

    public EscrituraCSV(String archivo) {
        this.archivo = archivo;
        this.scanner = new Scanner(System.in);
    }

    public void agregarLineas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            System.out.println("Ingresa datos (nombre,edad,ciudad). Para terminar escribe 'salir'.");
            while (true) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine().trim();
                if (nombre.equalsIgnoreCase("salir")) break;

                System.out.print("Edad: ");
                int edad;
                try {
                    edad = Integer.parseInt(scanner.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Edad no válida.");
                    continue;
                }

                System.out.print("Ciudad: ");
                String ciudad = scanner.nextLine().trim();

                String linea = "\"" + nombre + "\"," + edad + ",\"" + ciudad + "\"";
                bw.write(linea);
                bw.newLine();
                System.out.println("Agregado: " + linea);
            }
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
    }
}
