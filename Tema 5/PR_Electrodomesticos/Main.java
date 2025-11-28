void main() {
    Electrodomestico elect1 = new Electrodomestico(50, Colores.Plateado, "L", 20);
    elect1.PrecioFinal();
    Electrodomestico elect2 = new Electrodomestico(100, Colores.Blanco, "Z", 10);
    elect2.PrecioFinal();
    Lavadora lavadoraAEG = new Lavadora(400, Colores.Plateado, "PK", 30, 7);
    lavadoraAEG.PrecioFinal();
    Television tvSamsung = new Television(190, Colores.Negro,"A+", 10, 24, true);
    tvSamsung.PrecioFinal();


    System.out.println(elect1);
    System.out.println("-------------");
    System.out.println(elect2);
    System.out.println("-------------");
    System.out.println(lavadoraAEG);
    System.out.println("-------------");
    System.out.println(tvSamsung);
}
