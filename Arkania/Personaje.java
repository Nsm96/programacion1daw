public abstract class Personaje implements HabilidadEspecial {

    protected String nombre;
    protected int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public abstract void atacar();

    public void subirNivel() {
        nivel++;
        System.out.println(nombre + " ha subido al nivel " + nivel + "!");
    }

    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
}
