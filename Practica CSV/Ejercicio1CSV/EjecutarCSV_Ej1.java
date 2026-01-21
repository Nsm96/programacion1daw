package Ejercicio1CSV;

import java.util.Scanner;

public class EjecutarCSV_Ej1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué datos quieres escribir? recuerda ponerlo en formato nombre,edad,ciudad: ");
        EscribirCSV_Ej1.escribir("C:\\Users\\1DAW\\Desktop\\pruebacsv.csv", sc.next());
    }

}
