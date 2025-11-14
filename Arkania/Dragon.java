public class Dragon implements Enemigo {

    private String nombre;
    private int puntosVida;

    public Dragon(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    @Override
    public void atacar() {
        System.out.println("El dragón " + nombre + " lanza una bocanada de fuego.");
    }

    @Override
    public void huir() {
        System.out.println("El dragón " + nombre + " vuela hacia las montañas.");
    }

    @Override
    public String toString() {
        return "Dragon{" + "nombre='" + nombre + "', PV=" + puntosVida + "}";
    }
}
