package Ejercicio4CSV;

import java.util.Scanner;

public class Ejecutadora_Ej4 {
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Estás sobreescribiendo los datos, indica cuales deben ser los nuevos :");
        Escribir_Ej4.escribir("C:\\Users\\1DAW\\Desktop\\datos.csv", sc.next());
    }
}
