package Ejercicio5CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer_Ej5 {
    public static void leer (String path){
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(path);
            br = new BufferedReader(fr);
            String contenido;
            int contador = 0;
            while ((contenido = br.readLine()) != null) {
                contador++;
                System.out.println("Línea " + contador + ": " + contenido);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
