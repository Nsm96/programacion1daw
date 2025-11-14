public class JuegoRPG {

    public static void main(String[] args) {

        Personaje guerrero = new Guerrero("Arthas", 5);
        Personaje mago = new Mago("Merlín", 7);
        Personaje arquero = new Arquero ("Sylvanas", 10);
        Personaje hechicerasombras = new HechiceraSombras("Helya", 10);
    // Ataque
        guerrero.atacar();
        mago.atacar();
        arquero.atacar();
        hechicerasombras.atacar();
    // Habilidad - Personaje
        guerrero.usarHabilidad();
        mago.usarHabilidad();
        arquero.usarHabilidad();
        hechicerasombras.usarHabilidad();
    // Subir de nivel
        guerrero.subirNivel();
        mago.subirNivel();
        arquero.subirNivel();
        hechicerasombras.usarHabilidad();
    // -- Enemigos --
        Enemigo slime = new Slime("Verde", 30);
        Enemigo dragon = new Dragon("Ignis", 300);
    // Ataque - enemigo
        slime.atacar();
        slime.huir();
        dragon.atacar();
        dragon.huir();
    // Funciones
        Enemigo[] enemigos = { slime, dragon };
        for (Enemigo e : enemigos) {
            e.atacar();
        }
        Personaje[] personaje = {arquero, mago};
            for (Personaje p : personaje) {
                p.usarHabilidad();
            }
    }
}
