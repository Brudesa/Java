import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> itensEscolhidos = new ArrayList<>();

    public void adicionarItem(Item item) {
        itensEscolhidos.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item i : itensEscolhidos) {
            total += i.getPreco();
        }
        return total;
    }

    public List<Item> getItens() {
        return itensEscolhidos;
    }
}
