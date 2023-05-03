import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Sorvete> sorvetes = new ArrayList<>();

    public void adicionar(String sabor, String nomeAdicional, String calda) {
        Adicional adicional = AdicionalFactory.getAdicional(nomeAdicional, calda);
        Sorvete sorvete = new Sorvete(sabor, adicional);
        sorvetes.add(sorvete);
    }

    public List<String> obterSorvetes() {
        List<String> saida = new ArrayList<String>();
        for (Sorvete sorvete : this.sorvetes) {
            saida.add(sorvete.obterSorvete());
        }
        return saida;
    }
}
