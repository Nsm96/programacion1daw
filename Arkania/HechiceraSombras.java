public class HechiceraSombras extends Personaje {

    public HechiceraSombras (String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza una descarga de caos.");
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre + " usa su habilidad especial: Tormento oscuro.");
    }
}
