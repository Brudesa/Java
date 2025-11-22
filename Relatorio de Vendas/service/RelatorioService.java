package service;

import model.Venda;
import model.Produto;

public class RelatorioService {

    public String gerarTexto(Venda venda) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO DE VENDAS ===\n");
        sb.append("Cliente: ").append(venda.getCliente()).append("\n\n");

        if (venda.getProdutos().isEmpty()) {
            sb.append("Nenhum produto cadastrado.\n");
            return sb.toString();
        }

        sb.append("Itens:\n");
        for (Produto p : venda.getProdutos()) {
            sb.append("- ")
              .append(p.getNome())
              .append(" | R$ ").append(String.format("%.2f", p.getPreco()))
              .append(" | Quantidade: ").append(p.getQuantidade())
              .append(" | Total: R$ ").append(String.format("%.2f", p.getTotal()))
              .append("\n");
        }

        sb.append("\n--- Indicadores ---\n");
        sb.append("Total vendido: R$ ").append(String.format("%.2f", venda.calcularTotal())).append("\n");
        sb.append("Quantidade de produtos: ").append(venda.getProdutos().size()).append("\n");
        sb.append("Ticket médio: R$ ").append(String.format("%.2f", venda.calcularTicketMedio())).append("\n");

        Produto caro = venda.maisCaro();
        if (caro != null)
            sb.append("Produto mais caro: ").append(caro.getNome()).append("\n");

        return sb.toString();
    }
}
