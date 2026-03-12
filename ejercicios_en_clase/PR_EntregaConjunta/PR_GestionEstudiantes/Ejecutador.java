import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ejecutador {

    public static void main(String[] args) {

        List<Estudiante> listaEstudiantes = new ArrayList<>();

        Set<String> ciudadesUnicas = new HashSet<>();

        Map<String, List<Estudiante>> estudiantesPorCiudad = new HashMap<>();

        Queue<Estudiante> colaAtencion = new LinkedList<>();

        String archivo = "estudiantes.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String ciudad = datos[2];
                double calificacion = Double.parseDouble(datos[3]);

                Estudiante estudiante = new Estudiante(nombre, edad, ciudad, calificacion);

                listaEstudiantes.add(estudiante);

                ciudadesUnicas.add(ciudad);

                estudiantesPorCiudad
                        .computeIfAbsent(ciudad, k -> new ArrayList<>())
                        .add(estudiante);

                colaAtencion.add(estudiante);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato de datos: " + e.getMessage());
        }

        System.out.println("Lista de estudiantes:");
        for (Estudiante e : listaEstudiantes) {
            System.out.println(e);
        }

        System.out.println("\nCiudades únicas:");
        for (String ciudad : ciudadesUnicas) {
            System.out.println(ciudad);
        }

        System.out.println("\nEstudiantes por ciudad:");

        for (String ciudad : estudiantesPorCiudad.keySet()) {
            System.out.println("Ciudad: " + ciudad);

            for (Estudiante e : estudiantesPorCiudad.get(ciudad)) {
                System.out.println("  " + e);
            }
        }

        System.out.println("\nAtendiendo estudiantes:");

        while (!colaAtencion.isEmpty()) {
            Estudiante atendido = colaAtencion.poll();
            System.out.println("Atendiendo a: " + atendido);
        }
    }
}