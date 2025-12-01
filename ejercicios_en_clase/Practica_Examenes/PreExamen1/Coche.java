import java.util.Scanner;

public class Coche extends Vehiculo {
    protected int numPuertas;

    public Coche(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de puertas: " + numPuertas);
    }

    @Override
    public void encenderMotor() {
        System.out.println("El coche ha sido encendido.");

    }

    public void abrirPuertas() {
        if (numPuertas > 2) {
            System.out.println("Este coche tiene más de 2 puertas");
        }
        for (int i = 1; i <= numPuertas; i++) {
            System.out.println("Puerta número " + i + " ha sido abierta");
        }

    }

    public static Coche crearCochePorConsola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la marca del coche");
        String marca = sc.nextLine();
        System.out.println("Introduce el modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Introduce el número de puertas: ");
        int numero_puertas = sc.nextInt();

        Coche coche = new Coche(marca, modelo, numero_puertas);
        return coche;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}


