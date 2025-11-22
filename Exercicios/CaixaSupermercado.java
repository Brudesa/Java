import java.util.*;

public class CaixaSupermercado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("=== Supermercado EduTech ===");
        System.out.println("Digite os produtos (ou 'fim' para encerrar)\n");

        while (true) {
            String nome = ValidadorEntrada.lerTexto(in, "Produto: ");
            if (nome.equalsIgnoreCase("fim")) break;

            double preco = ValidadorEntrada.lerDouble(in, "Preço unitário: ");
            int qtd = ValidadorEntrada.lerInteiro(in, "Quantidade: ");

            carrinho.adicionarProduto(new Produto(nome, preco, qtd));
        }

        double subtotal = carrinho.calcularTotal();
        double totalComDesconto = carrinho.aplicarDesconto(subtotal);

        System.out.printf("\nSubtotal: R$ %.2f%n", subtotal);
        if (subtotal != totalComDesconto)
            System.out.printf("Desconto aplicado! Novo total: R$ %.2f%n", totalComDesconto);

        double pago = ValidadorEntrada.lerDouble(in, "Valor pago: ");
        double troco = pago - totalComDesconto;

        Exibidor.exibirRecibo(carrinho, totalComDesconto, pago, troco);

        in.close();
    }
}

/* ---- Classe Produto ---- */
class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double total() {
        return preco * quantidade;
    }
}

/* ---- Carrinho ---- */
class CarrinhoDeCompras {
    List<Produto> produtos = new ArrayList<>();

    void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    double calcularTotal() {
        double soma = 0;
        for (Produto p : produtos) soma += p.total();
        return soma;
    }

    double aplicarDesconto(double total) {
        if (total > 100) return total * 0.9; // 10% de desconto
        return total;
    }
}

/* ---- ValidadorEntrada ---- */
class ValidadorEntrada {
    static String lerTexto(Scanner in, String msg) {
        while (true) {
            System.out.print(msg);
            String s = in.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("Entrada inválida. Digite algo.");
        }
    }

    static double lerDouble(Scanner in, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                double v = Double.parseDouble(in.nextLine().trim().replace(',', '.'));
                if (v >= 0) return v;
                System.out.println("Valor não pode ser negativo.");
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido (ex: 12.50)");
            }
        }
    }

    static int lerInteiro(Scanner in, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                int v = Integer.parseInt(in.nextLine().trim());
                if (v > 0) return v;
                System.out.println("Quantidade deve ser positiva.");
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }
}

/* ---- Exibidor ---- */
class Exibidor {
    static void exibirRecibo(CarrinhoDeCompras carrinho, double total, double pago, double troco) {
        System.out.println("\n=== RECIBO DE COMPRA ===");
        for (Produto p : carrinho.produtos) {
            System.out.printf("%-15s x%d  R$ %.2f%n", p.nome, p.quantidade, p.total());
        }
        System.out.println("----------------------------");
        System.out.printf("Total a pagar: R$ %.2f%n", total);
        System.out.printf("Valor pago: R$ %.2f%n", pago);
        System.out.printf("Troco: R$ %.2f%n", troco);
        System.out.println("============================");
    }
}
