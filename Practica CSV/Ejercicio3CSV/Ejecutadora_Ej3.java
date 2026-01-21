package Ejercicio3CSV;

public class Ejecutadora_Ej3 {
    public static void main(String[] args) {
        String archivo = "C:\\Users\\1DAW\\Desktop\\datos.csv";

        LecturaCSV lector = new LecturaCSV(archivo);
        EscrituraCSV escritor = new EscrituraCSV(archivo);

        lector.leerArchivo();
        escritor.agregarLineas();
        lector.leerArchivo();
    }
}
