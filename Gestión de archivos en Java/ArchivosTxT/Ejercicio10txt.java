package ArchivosTXT;
import java.io.*;
import java.util.Scanner;

public class Ejercicio10txt {
    public static void main(String[] args) {
        File f = new File("archivo2.txt");
        if (f.exists()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("¿Quieres eliminar 'archivo2.txt'? (s/n): ");
            if (sc.next().equalsIgnoreCase("s")) {
                if (f.delete()) System.out.println("Archivo eliminado.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
