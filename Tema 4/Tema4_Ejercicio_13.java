import java.util.Random;

public class Tema4_Ejercicio_13 {
    static void main() {
        Random rng = new Random();
        int longitud = 8;
        String letras_numeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenia = "";

        for (int i = 0; i < longitud; i++) {
            int aleatorio = rng.nextInt(letras_numeros.length());
            contrasenia += letras_numeros.charAt(aleatorio);

        }
        System.out.println("Contraseña generada: " + contrasenia);
    }
}
