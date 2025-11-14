public class Guerrero extends Personaje {

    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su espada poderosa!");
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre + " usa su habilidad especial: Grito de batalla.");
    }
}
