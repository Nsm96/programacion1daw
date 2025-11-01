import java.util.Scanner;

public class Tema4_Ejercicio_11 {
    static void main() {
        // Introducción
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        char cadena_entera;
        boolean palabra = false;
        int contador = 0;
        // Desarrollo

        System.out.println("Introduce una cadena: ");
        cadena = sc.nextLine();
        for (int i = 0; i < cadena.length(); i++){
           cadena_entera = cadena.charAt(i);
           if (cadena_entera != ' ' && !palabra){
               palabra = true;
               contador++;
           } else if (cadena_entera == ' '){
               palabra = false;
           }
        }
        // Desenlace
        System.out.println("En esta frase hay " + contador + " palabras.");
    }
}
