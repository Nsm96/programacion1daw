import java.util.Scanner;

public class Pelicula extends Obra {
    private String director;
    private int duracionMinutos;
    private static boolean ganadoraOscar;

    public Pelicula(String titulo, String autor, int anioPublicacion, String director, int duracionMinutos, boolean ganadoraOscar) {
        super(titulo, autor, anioPublicacion);
        this.director = director;
        this.duracionMinutos = duracionMinutos;
        this.ganadoraOscar = ganadoraOscar;
    }

    public Pelicula(String director, int duracionMinutos, boolean ganadoraOscar) {
        this.director = director;
        this.duracionMinutos = duracionMinutos;
        this.ganadoraOscar = ganadoraOscar;
    }

    @Override
    public void mostrarResumen() {
        System.out.println(titulo);
        System.out.println(director);
        System.out.println(duracionMinutos);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(ganadoraOscar);
    }

    public void reproducir(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Reproducida " + veces + " veces.");
            }
        }
    public void reproducir(){
            reproducir(1);
        }
    public static Pelicula crearPeliculaPorConsola(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el título: ");
        String titulo = sc.nextLine();
        System.out.println("Introduzca el director: ");
        String director = sc.nextLine();
        System.out.println("Introduzca la duración (en minutos): ");
        int duracion_minutos = sc.nextInt();
        return new Pelicula(titulo, director, 2025, director, duracion_minutos, ganadoraOscar);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isGanadoraOscar() {
        return ganadoraOscar;
    }

    public void setGanadoraOscar(boolean ganadoraOscar) {
        this.ganadoraOscar = ganadoraOscar;
    }
}

