public class Arquero extends Personaje {

    public Arquero (String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza una flecha cargada.");
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre + " usa su habilidad especial: Salva de flechas.");
    }
}
