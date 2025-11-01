import java.util.Scanner;

public class Tema4_Ejercicio_10 {
    static void main() {
        // Introducción
        Scanner sc = new Scanner(System.in);
        String cadena, cadena_mas_larga="";
        int contador = 0;

        // Desarrollo
        while (true){
            System.out.println("Introduce una cadena: ");
            cadena = sc.next().toLowerCase();
            if (cadena.equals("salir")){
                break;
            }
            contador++;
            if (cadena.length() > cadena_mas_larga.length()){
                cadena_mas_larga = cadena;
            }
        }

        // Desenlace
        System.out.println("Número de cadenas ingresadas: " + contador);
        if (contador > 0){
            System.out.println("La cadena más larga es: " + "[" + cadena_mas_larga + "]" + "con un total de: " + cadena_mas_larga.length() + " caracteres.");
        }

    }
}
