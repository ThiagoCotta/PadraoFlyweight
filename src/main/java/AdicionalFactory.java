import java.util.HashMap;
import java.util.Map;

public class AdicionalFactory {
    private static Map<String, Adicional> adicionais = new HashMap<>();

    public static Adicional getAdicional(String itemAdicional, String calda) {
        Adicional adicional = adicionais.get(itemAdicional);
        if (adicional == null) {
            adicional = new Adicional(itemAdicional, calda);
            adicionais.put(itemAdicional, adicional);
        }
        return adicional;
    }

    public static int getTotalAdicionais() {
        return adicionais.size();
    }

}