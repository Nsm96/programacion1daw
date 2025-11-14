public class Mago extends Personaje {

    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un proyectil mágico.");
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre + " usa su habilidad especial: Tormenta de fuego.");
    }
}
