import java.util.Scanner;

public class Tema4_Ejercicio_14 {
    public static void main(String[] args) {
        // Introducción
        Scanner sc = new Scanner(System.in);
        String cadena = "", resultado = "";
        char cambio;
        // Desarrollo
        System.out.println("Introduce una cadena: ");
        cadena = sc.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isUpperCase(c)) {
                resultado += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                resultado += Character.toUpperCase(c);
            } else {
                resultado += c;
            }
        }
        // Desenlace
        System.out.println("El texto cambiado es: " + resultado);
        }
    }

