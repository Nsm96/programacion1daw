import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Tema3_Ejercicio_7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String usuario1 = "";
        String usuario2 = "";
        String piedra = "", papel = "", tijera = "", lagarto ="", spock="";
            System.out.println("Jugador 1, elige: ");
            usuario1 = sc.nextLine().toLowerCase();
            System.out.println("Jugador 2, elige: ");
            usuario2 = sc.nextLine().toLowerCase();

        if (usuario1.equals(usuario2)) {
            System.out.println("¡Empate!");
            } else {
                String juego = usuario1 + "-" + usuario2;
                switch (juego) {
                    case "tijera-papel":
                    case "papel-piedra":
                    case "piedra-lagarto":
                    case "lagarto-spock":
                    case "spock-tijeras":
                    case "tijeras-lagarto":
                    case "lagarto-papel":
                    case "papel-spock":
                    case "spock-piedra":
                    case "piedra-tijeras":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "papel-tijeras":
                    case "piedra-papel":
                    case "lagarto-piedra":
                    case "tijeras-spock":
                    case "lagarto-tijeras":
                    case "spock-papel":
                    case "piedra-spock":
                    case "tijeras-piedra":
                        System.out.println("¡Gana el jugador 2!");
                        break;
            }
        }
    }
}

