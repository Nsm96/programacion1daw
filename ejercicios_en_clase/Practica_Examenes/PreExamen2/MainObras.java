static void main() {
    Libro milibro = Libro.crearLibroPorConsola();
    System.out.println(milibro);

    Pelicula mipelicula = Pelicula.crearPeliculaPorConsola();
    System.out.println(mipelicula);

    Serie miSerie1 = new Serie("Los de daw", "Antonio", 2025, 2, true);
    System.out.println(miSerie1);
    Serie miSerie2 = new Serie("Los de daw Return","Antonio", 2026,2,false);
    System.out.println(miSerie2);

    milibro.compararAnio(mipelicula);

}



