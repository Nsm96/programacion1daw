import java.util.Scanner;

public class LeerConsola {
    public static String leerTexto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce algo: ");
        return sc.nextLine();
    }
}
