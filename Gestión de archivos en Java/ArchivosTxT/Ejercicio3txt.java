package ArchivosTXT;

import java.io.*;
import java.nio.file.*;
public class Ejercicio3txt {
    public static void main(String[] args) {
        Path origen = Paths.get("archivo1.txt");
        Path destino = Paths.get("archivo2.txt");
        try {
            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copia de 'archivo2.txt' realizada.");
        } catch (IOException e) {
            System.out.println("Error al copiar: " + e.getMessage());
        }
    }
}
