import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP_Ejercicio_10 {
    public static void main(String[] args) {
        Map<String, Integer> votos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce votos (fin para terminar):");
        while (true) {
            System.out.print("Candidato: ");
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            if (votos.containsKey(nombre)) {
                votos.put(nombre, votos.get(nombre) + 1);
            } else {
                votos.put(nombre, 1);
            }
        }

        System.out.println("Resultados:");
        for (String candidato : votos.keySet()) {
            System.out.println(candidato + " -> " + votos.get(candidato) + " votos");
        }

        String ganador = null;
        int maxVotos = -1;
        for (String candidato : votos.keySet()) {
            int v = votos.get(candidato);
            if (v > maxVotos) {
                maxVotos = v;
                ganador = candidato;
            }
        }

        if (ganador != null) {
            System.out.println("Ganador: " + ganador + " con " + maxVotos + " votos");
        } else {
            System.out.println("No se registraron votos.");
        }

        sc.close();
    }
}
