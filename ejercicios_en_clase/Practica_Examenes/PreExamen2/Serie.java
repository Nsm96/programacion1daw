public class Serie extends Obra {
    private int temporadas;
    private boolean enEmision;

    public Serie(String titulo, String autor, int anioPublicacion, int temporadas, boolean enEmision) {
        super(titulo, autor, anioPublicacion);
        this.temporadas = temporadas;
        this.enEmision = enEmision;
    }

    public Serie(int temporadas, boolean enEmision) {
        this.temporadas = temporadas;
        this.enEmision = enEmision;
    }

    @Override
    public void mostrarResumen() {
        System.out.println(temporadas);
        System.out.println(enEmision);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Serie basada en tus sueños.");
    }

    public void reproducirTemporadas(){
        for (int i = 0; i < temporadas; i++){
            System.out.println("Se ha reproducido al temporada: " + i);
        }
    }
}
