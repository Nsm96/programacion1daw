package Ejercicio9CSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ordenarCSV_Ej9 {
    public static void ordenar(String path, String path2, boolean tieneCabecera) {

        String cabecera = null;

        String[][] datos = new String[15][3];
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            boolean primeraLinea = false;

            while ((linea = br.readLine()) != null) {

                linea = linea.trim();
                if (!primeraLinea && tieneCabecera) {
                    cabecera = linea;
                    primeraLinea = true;
                    continue;
                }

                String[] partes = linea.split(",");

                datos[contador][0] = partes[0];
                datos[contador][1] = partes[1];
                datos[contador][2] = partes[2];

                contador++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ordenar
        String[][] datosFinales = new String[contador][3];
        for (int i = 0; i < contador; i++) {
            datosFinales[i][0] = datos[i][0];
            datosFinales[i][1] = datos[i][1];
            datosFinales[i][2] = datos[i][2];
        }

        ordenar2(datosFinales);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
            if (tieneCabecera) {
                bw.write(cabecera);
                bw.newLine();
            }

            for (int i = 0; i < contador; i++) {
                bw.write(datosFinales[i][0] + "," + datosFinales[i][1] + "," + datosFinales[i][2]);
                bw.newLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ordenar2(String[][] datos2) {
        for (int i = 0; i < datos2.length - 1; i++) {
            int minIdx = i;
            int minEdad = Integer.parseInt(datos2[i][1]);

            for (int j = i + 1; j < datos2.length; j++) {
                int edadAEvaluar = Integer.parseInt(datos2[j][1]);
                if (edadAEvaluar < minEdad) {
                    minEdad = edadAEvaluar;
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                String[] tmp = datos2[i];
                datos2[i] = datos2[minIdx];
                datos2[minIdx] = tmp;
            }
        }
    }
}
