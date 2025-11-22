import java.util.Scanner;

public class LojaDeDescontos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== 🛍️ Loja de Descontos ===");

        double valorCompra = lerDouble(in, "Digite o valor da compra (R$): ");
        System.out.print("Digite o cupom de desconto: ");
        String cupom = in.nextLine().trim();

        double valorFinal = calcularDesconto(valorCompra, cupom);
        exibirResultado(valorCompra, cupom, valorFinal);

        in.close();
    }

    // ---------- Funções Auxiliares ----------

    // Lê número decimal (aceita vírgula ou ponto)
    static double lerDouble(Scanner in, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = in.nextLine().trim().replace(",", ".");
                double valor = Double.parseDouble(entrada);
                if (valor >= 0) return valor;
                System.out.println("Valor não pode ser negativo. Tente novamente.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido (ex: 100.50).");
            }
        }
    }

    // Calcula o valor final com base no cupom
    static double calcularDesconto(double valor, String cupom) {
        double desconto = 0;

        if (cupom.equalsIgnoreCase("BRUNA10")) {
            desconto = 10;
        } else if (cupom.equalsIgnoreCase("CLIENTEVIP")) {
            desconto = 20;
        } else if (cupom.equalsIgnoreCase("SEMCOPO")) {
            desconto = 0; // cupom "SEMCOPO" não dá desconto
        } else {
            desconto = 0; // cupom inválido
        }

        return valor - (valor * desconto / 100);
    }

    // Exibe o resultado final com mensagem personalizada
    static void exibirResultado(double valorCompra, String cupom, double valorFinal) {
        System.out.println("\n=== 💳 Resultado da Compra ===");

        if (cupom.equalsIgnoreCase("BRUNA10")) {
            System.out.println("Cupom BRUNA10 aplicado: 10% de desconto!");
        } else if (cupom.equalsIgnoreCase("CLIENTEVIP")) {
            System.out.println("Cupom CLIENTEVIP aplicado: 20% de desconto!");
        } else if (cupom.equalsIgnoreCase("SEMCOPO")) {
            System.out.println("Cupom SEMCOPO: sem desconto, mas você ajudou o meio ambiente 🌱");
        } else {
            System.out.println("Cupom inválido. Nenhum desconto aplicado.");
        }

        System.out.printf("Valor original: R$ %.2f%n", valorCompra);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
    }
}
