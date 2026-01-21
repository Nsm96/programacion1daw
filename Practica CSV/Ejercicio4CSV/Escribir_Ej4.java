package Ejercicio4CSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Ej4 {
    public static void escribir(String path, String contenido) {
            BufferedWriter bw = null;
            try {
                FileWriter fw = new FileWriter(path, false);
                bw = new BufferedWriter(fw);
                bw.write(contenido);
                bw.newLine();
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            } finally {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e.getMessage());
                }
            }
        }
    }

