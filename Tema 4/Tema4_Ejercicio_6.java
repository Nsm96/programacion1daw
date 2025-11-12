import java.util.Scanner;

public class Tema4_Ejercicio_6 {
    static void main() {
    // Introducción
    Scanner sc = new Scanner(System.in);
    String frase;
    char letra;
    int contador = 0;
    // Desarrollo
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine().trim();

        for (int i = 0; i < frase.length(); i++){
            letra = frase.charAt(i);
            if  (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }
    // Desenlace
        System.out.println("En esta frase hay " + contador + " vocales.");

    }
}
