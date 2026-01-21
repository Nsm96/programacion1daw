package Ejercicio9CSV;

public class Ejecutadora_Ej9 {
    public static void main(String[] args) throws Exception {
        String origen = "C:\\Users\\rauln\\OneDrive\\Escritorio\\1 DAW\\Programación\\leer y escribir csv\\datos.csv";
        String ordenado = "C:\\Users\\rauln\\OneDrive\\Escritorio\\1 DAW\\Programación\\leer y escribir csv\\ordenado.csv";
        boolean cabecera = true;
        System.out.println("Archivo ordenado");

        ordenarCSV_Ej9.ordenar(origen, ordenado, cabecera);
    }
}
