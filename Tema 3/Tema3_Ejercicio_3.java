import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_3 {
   static void main() {
       Scanner sc = new Scanner(System.in);
       double nota_lenguajedemarcas;
       double nota_programacion;
       double nota_entornos;
       double nota_sistemas;
       double nota_basesdedatos;
       double promedio;


       System.out.println("Introduce tu no ta de Programación: ");
       nota_programacion = sc.nextDouble();
       if (nota_programacion <0 || nota_programacion >100){
           System.out.println("Nota no válida. (Recuerda que la nota es entre 0 y 100).");
           return;
       }
       System.out.println("Introduce tu nota de Bases de datos: ");
       nota_basesdedatos = sc.nextDouble();
       if (nota_basesdedatos <0 || nota_basesdedatos >100){
           System.out.println("Nota no válida. (Recuerda que la nota es entre 0 y 100).");
           return;
       }
       System.out.println("Introduce tu nota de Lenguaje de marcas: ");
       nota_lenguajedemarcas = sc.nextDouble();
       if (nota_lenguajedemarcas <0 || nota_lenguajedemarcas >100){
           System.out.println("Nota no válida. (Recuerda que la nota es entre 0 y 100).");
           return;
       }
       System.out.println("Introduce tu nota de Sistemas informáticos: ");
       nota_sistemas = sc.nextDouble();
       if (nota_sistemas <0 || nota_sistemas >100){
           System.out.println("Nota no válida. (Recuerda que la nota es entre 0 y 100).");
           return;
       }
       System.out.println("Introduce tu nota de Entornos de desarrollo: ");
       nota_entornos = sc.nextDouble();
       if (nota_entornos <0 || nota_entornos >100){
           System.out.println("Nota no válida. (Recuerda que la nota es entre 0 y 100).");
           return;
       }


       promedio = (nota_programacion + nota_basesdedatos + nota_lenguajedemarcas + nota_sistemas + nota_entornos) / 5;
       if (promedio <= 0 && promedio >= 100) {
       } else if (promedio >= 90) {
           System.out.println("Tu calificación es: A");
       } else if (promedio >= 80) {
           System.out.println("Tu calificación es: B");
       } else if (promedio >= 70) {
           System.out.println("Tu calificación es: C");
       } else if (promedio >= 60) {
           System.out.println("Tu calificación es: D");
       } else if (promedio < 60) {
           System.out.println("Tu calificación es: F");
       } else {
           System.out.println("Nota no válida.");
       }
   }
}


