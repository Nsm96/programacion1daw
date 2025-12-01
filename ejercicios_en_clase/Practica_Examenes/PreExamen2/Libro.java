import java.util.Scanner;

public class Libro extends Obra {
    private int numeroPaginas;
    private String genero;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas, String genero) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public Libro(int numeroPaginas, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    @Override
    public void mostrarResumen() {
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(genero);
        System.out.println(numeroPaginas);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(numeroPaginas);
        System.out.println(genero);
    }

    public void leer(int minutos){
        for (int i = 0; i < minutos; i++){
            System.out.println("Leyendo ..." + i + " minutos.");
        }
    }
    public void leer(){
        leer(3);
    }

    public static Libro crearLibroPorConsola() {
        System.out.println("--- Creando un libro ---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el título: ");
        String titulo = sc.nextLine();
        System.out.println("Introduzca el autor: ");
        String autor = sc.nextLine();
        System.out.println("Introduca el género: ");
        String genero = sc.nextLine();
        System.out.println("Introduzca el número de páginas: ");
        int num_paginas = sc.nextInt();

        return new Libro(titulo, autor, 2025, num_paginas, genero);
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
