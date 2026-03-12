import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Gimnasio {
    public static ArrayList<Socios> socio = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    static {
        socio.add(new Socios("Pepe", "123", 29, "09/03/2026", true));
        socio.add(new Socios("Maria", "456", 29, "09/03/2026", true));
        socio.add(new Socios("Juan", "789", 29, "09/03/2026", true));
        socio.add(new Socios("Javi", "101010", 29, "09/03/2026", true));
        socio.add(new Socios("Ángel", "111111", 29, "09/03/2026", true));
    }
    public static void menu() {
        int num;
        do {
            System.out.println("¿Qué acción quieres hacer?");
            System.out.println("1. Alta\n2.Baja \n3. Listar socios activos\n4. Listar inactivos\n5. Borrar socio\n6. Salir");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    alta();
                    break;
                case 2:
                    baja();
                    break;
                case 3:
                    listarActivos();
                    break;
                case 4:
                    listarInactivos();
                    break;
                case 5:
                    borrarSocio();
                    break;

                default:
                    System.out.println("Inválido");
                    break;
            }

        } while (num != 6);
    }

    public static void alta() {
        boolean activo = true;
        System.out.println("Introduce el nomrbe: ");
        String nombre = sc.next();
        System.out.println("Introduce el DNI: ");
        String dni = sc.next();

        for (Socios s : socio){
            if (s.getDni().equals(dni)){
                System.out.println("Usuario ya existe");
                return;
            }
        }

        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce la fecha: ");
        String fecha = sc.next();

        socio.add(new Socios (nombre, dni, edad, fecha, activo));
        System.out.println("Socio añadido " + socio);

    }

    public static void baja(){
        System.out.println("Para buscar el usuario, introduce su DNI: ");
        String dni = sc.next();

        for (Socios s : socio){
            if (s.getDni().equals(dni)){
                s.setActivo(false);
                System.out.println("Usuario dado de baja: " + s.getNombre());
            }
        }
    }

    public static void listarActivos(){
        ArrayList<Socios> listActivos = new ArrayList<>();

        for (Socios s : socio){
            if (s.isActivo()){
                listActivos.add(s);
            }
        }
        listActivos.sort(Comparator.comparing(Socios::getNombre));
        for (Socios l : listActivos) {
            System.out.println(l);
        }
    }

    public static void listarInactivos(){
        ArrayList<Socios> listInactivos = new ArrayList<>();

        for (Socios s : socio){
            if (!s.isActivo()){
                listInactivos.add(s);
            }
        }
        listInactivos.sort(Comparator.comparing(Socios::getDni));
        for (Socios l : listInactivos){
            System.out.println(l);
        }
    }
    public static void borrarSocio(){
        System.out.println("Introduce el DNI del socio a eliminar: ");
        String dni = sc.next();
        for (Socios s : socio){
            if (s.getDni().equals(dni)){
                socio.remove(s);
                System.out.println("Usuario borrado: " + s);
                return;
            }
        }
    }
}
