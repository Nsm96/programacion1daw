    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String bf_si_no;
        //  creo mis productos

        Tienda impresora_hp = new Tienda("Impresora HP", 100, 21, 5);
        Tienda raton = new Tienda("raton", 20, 4, 15);
        Tienda libro_java = new Tienda("libro java", 20, 4, 15);
        // imprimo los productos

        System.out.println(impresora_hp);
        System.out.println(raton);
        System.out.println(libro_java);
        System.out.println("Número de prodcutos: " + Tienda.getNum_productos());

        System.out.println("¿Es BlackFriday?: ");
        bf_si_no = sc.next().toLowerCase();
        // ¿BF? calcular el descuento con blackfriday

            if (bf_si_no.equals("si")){
                    Tienda.setDescuento_global(10);
                System.out.println("Descuento global aplicado: 10%");
                    raton.setPrecio(13);
                System.out.println("El precio del ratón ahora es: " + raton.getPrecio());
                // En caso de ser BF, imprimo el precio con descuento
                System.out.println("\n --- Con descuento de Black Friday---");
                    System.out.println(impresora_hp);
                    System.out.println(raton);
                    System.out.println(libro_java);
                System.out.println("Número de productos: " + Tienda.getNum_productos());
            } else if (bf_si_no.equals("no")) {
                System.out.println("¡No es BF, los precios no varían!");
            } else {
                System.out.println("Por favor, indica si es Black Friday");
            }




    }
