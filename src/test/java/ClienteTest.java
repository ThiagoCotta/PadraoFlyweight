import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarSorvetes() {
        Pedido pedido = new Pedido();
        pedido.adicionar("Morango", "Granola", "Leite Condensado");
        pedido.adicionar("Chocolate", "Ovomaltine", "Chocolate");

        List<String> saida = Arrays.asList(
                "Sorvete{sabor='Morango', adicional='Granola', calda='Leite Condensado'}",
                "Sorvete{sabor='Chocolate', adicional='Ovomaltine', calda='Chocolate'}");

        assertEquals(saida, pedido.obterSorvetes());
    }

    @Test
    void deveRetornarTotalCidades() {
        Pedido pedido = new Pedido();
        pedido.adicionar("Morango", "Granola", "Leite Condensado");
        pedido.adicionar("Chocolate", "Ovomaltine", "Chocolate");

        assertEquals(2, AdicionalFactory.getTotalAdicionais());
    }
}