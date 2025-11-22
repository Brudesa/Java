import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Item> itens = new ArrayList<>();

    public Cardapio() {
        itens.add(new Item("Hambúrguer", 18.00));
        itens.add(new Item("Pizza", 25.00));
        itens.add(new Item("Batata Frita", 12.00));
        itens.add(new Item("Refrigerante", 6.50));
        itens.add(new Item("Milkshake", 14.00));
    }

    public List<Item> getItens() {
        return itens;
    }
}
