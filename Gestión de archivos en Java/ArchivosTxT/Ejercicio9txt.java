package ArchivosTXT;
import java.io.*;
import java.util.Scanner;

public class Ejercicio9txt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filtrar líneas que contengan: ");
        String filtro = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("filtrado.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(filtro)) {
                    bw.write(linea);
                    bw.newLine();
                }
            }
            System.out.println("Resultado guardado en 'filtrado.txt'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
