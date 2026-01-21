package Ejercicio7CSV;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

    public class CopiaCSV {
        public static void main(String[] args) {
            String origen = "C:\\Users\\1DAW\\Desktop\\datos.csv";  // Cambia por tu archivo CSV existente
            Path origenPath = Paths.get(origen);
            Path destinoPath = Paths.get("C:\\Users\\1DAW\\Desktop\\copia_datos.csv");

            try {
                Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Archivo copiado correctamente a 'copia_datos.csv'");
            } catch (IOException e) {
                System.err.println("Error al copiar: " + e.getMessage());
            }
        }
    }

