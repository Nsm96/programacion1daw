public class Slime implements Enemigo {

    private String color;
    private int puntosVida;

    public Slime(String color, int puntosVida) {
        this.color = color;
        this.puntosVida = puntosVida;
    }

    @Override
    public void atacar() {
        System.out.println("El slime " + color + " salta y golpea ligeramente.");
    }

    @Override
    public void huir() {
        System.out.println("El slime " + color + " se escurre y huye...");
    }

    @Override
    public String toString() {
        return "Slime{" + "color='" + color + "', PV=" + puntosVida + "}";
    }
}
