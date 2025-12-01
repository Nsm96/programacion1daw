public abstract class Obra {
    protected String titulo;
    protected String autor;
    protected int AnioPublicacion;

    public Obra(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        AnioPublicacion = anioPublicacion;
    }
    public Obra() {

    }

    public abstract void mostrarResumen();

    public void mostrarDetalles(){

    }
    public void esAntigua(){

    }
    public void compararAnio(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return AnioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        AnioPublicacion = anioPublicacion;
    }
}
