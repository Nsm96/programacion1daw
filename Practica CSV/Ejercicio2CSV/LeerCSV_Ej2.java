package Ejercicio2CSV;

import java.io.*;

public class LeerCSV_Ej2 {
    public static void leer(String ruta) {
        BufferedReader br = null;

        try {
            FileReader fd = new FileReader(ruta);
            br = new BufferedReader(fd);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
            }
        }
    }

