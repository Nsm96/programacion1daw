public class Coche {
    private int id;
    private String marca;
    private int anio;
    private String color;

    public Coche(int id, String marca, int anio, String color) {
        this.id = id;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
    }

    public Coche(String marca, int anio, String color) {
        this.marca = marca;
        this.anio = anio;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }
}