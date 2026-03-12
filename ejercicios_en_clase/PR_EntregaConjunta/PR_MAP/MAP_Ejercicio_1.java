import java.util.HashMap;
import java.util.Map;

public class MAP_Ejercicio_1 {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<>();

        paises.put("España", "Madrid");
        paises.put("Francia", "París");
        paises.put("Italia", "Roma");
        paises.put("Alemania", "Berlín");
        paises.put("Portugal", "Lisboa");

        for (String pais : paises.keySet()) {
            System.out.println(pais + " -> " + paises.get(pais));
        }
    }
}
