void main() {
    Scanner sc = new Scanner(System.in);
    Electrodomestico elect1 = new Electrodomestico();
    Electrodomestico elect2 = new Electrodomestico(100, Colores.Blanco, "Z", 10);
    Electrodomestico lavadora = new Lavadora(100, Colores.Azul, "K", 10);



//    System.out.println("Introduce qué electrodomestico quieres consultar:");
//    String consulta = sc.next();


    System.out.println("Precio: " +elect2.precio_base + "€.");
    System.out.println("Color:  " +elect2.color + ".");
    System.out.println("Consumo: " +elect2.consumo_energetico + ".");
    System.out.println("Peso:  " +elect2.peso + ".");

//    System.out.println(elect2);
}