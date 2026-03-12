public class Estudiante {

    private String nombre;
    private int edad;
    private String ciudad;
    private double calificacion;

    public Estudiante(String nombre, int edad, String ciudad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}