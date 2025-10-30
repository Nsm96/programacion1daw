import java.util.Scanner;

public class Tema4_Ejercicio_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String frase;
        char letra;
        int contador = 0;
        System.out.println("Introduce una frase:");
        frase = sc.next();
        System.out.println("Indica la letra que quieres contar: ");
        letra = sc.next().toLowerCase().charAt(0);

        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i)==letra){
                contador++;
            }

        }
        System.out.println("En esa frase hay " + contador + " letras " + letra);
    }
}
