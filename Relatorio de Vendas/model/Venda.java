package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private String cliente;
    private List<Produto> produtos = new ArrayList<>();

    public Venda(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() { return cliente; }

    public List<Produto> getProdutos() { return produtos; }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getTotal).sum();
    }

    public double calcularTicketMedio() {
        if (produtos.isEmpty()) return 0;
        return calcularTotal() / produtos.size();
    }

    public Produto maisCaro() {
        return produtos.stream()
                       .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                       .orElse(null);
    }
}
