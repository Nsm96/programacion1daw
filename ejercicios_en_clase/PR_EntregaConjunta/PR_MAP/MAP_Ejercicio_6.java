import java.util.*;

public class MAP_Ejercicio_6 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> notasAlumnos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes quieres introducir? ");
        int numEst = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numEst; i++) {
            System.out.print("Nombre del estudiante: ");
            String nombre = sc.nextLine();

            System.out.print("¿Cuántas notas tiene " + nombre + "? ");
            int numNotas = Integer.parseInt(sc.nextLine());

            ArrayList<Integer> notas = new ArrayList<>();
            for (int j = 0; j < numNotas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                int nota = Integer.parseInt(sc.nextLine());
                notas.add(nota);
            }

            notasAlumnos.put(nombre, notas);
        }

        for (String nombre : notasAlumnos.keySet()) {
            ArrayList<Integer> notas = notasAlumnos.get(nombre);
            int suma = 0;
            for (int n : notas) {
                suma += n;
            }
            double promedio = (double) suma / notas.size();
            System.out.println("Promedio de " + nombre + ": " + promedio);
        }

        sc.close();
    }
}
