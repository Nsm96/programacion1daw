void main() {
    Electrodomestico elect1 = new Electrodomestico(50, Colores.Plateado, "L", 20);
        elect1.PrecioFinal();
    Electrodomestico elect2 = new Electrodomestico(100, Colores.Blanco, "Z", 10);
        elect2.PrecioFinal();
    Lavadora lavadoraAEG = new Lavadora(400, Colores.Plateado, "PK", 30, 7);
        lavadoraAEG.PrecioFinal();
    Television tvSamsung = new Television(100, Colores.Azul,"A", 5, 19,false);
        tvSamsung.PrecioFinal();

    // Muestro los resultados con los valores por defecto
    System.out.println(elect1);
    System.out.println("-------------");
    System.out.println(elect2);
    System.out.println("-------------");
    System.out.println(lavadoraAEG);
    System.out.println("-------------");
    System.out.println(tvSamsung);
    // Cambio de valores e impresión de los nuevos
        tvSamsung.setPrecio_base(190);
        tvSamsung.setColor(Colores.Negro);
        tvSamsung.setConsumo_energetico("A+");
        tvSamsung.setPeso(10);
        tvSamsung.setResolucion(24);
        tvSamsung.netflix = true;
    
    System.out.println("--- Televisión Samsung --- " + "\n* Resolución: " +
            tvSamsung.getResolucion() + "\n* Consumo Energético: " +
            tvSamsung.getConsumo_energetico() + "\n* Color: " +
            tvSamsung.getColor() + "\n* Peso: " +
            tvSamsung.getPeso() + "\n* Tiene netflix?: " + tvSamsung.netflix + "\n* Precio: " + tvSamsung.PrecioFinal());


}
