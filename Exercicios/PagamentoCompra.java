import java.util.Scanner;

public class PagamentoCompra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== Sistema de Pagamento ===");
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = in.nextDouble();

        System.out.println("\nEscolha o código da forma de pagamento:");
        System.out.println("1 - À vista (8% de desconto)");
        System.out.println("2 - À vista no cartão (4% de desconto)");
        System.out.println("3 - Em 2x (sem juros)");
        System.out.println("4 - Em 4x (8% de acréscimo)");
        System.out.print("Código: ");
        int codigo = in.nextInt();

        double valorFinal = 0;
        String tipoPagamento = "";
        int parcelas = 1;

        switch (codigo) {
            case 1:
                valorFinal = valorCompra * 0.92; // 8% de desconto
                tipoPagamento = "À vista (8% de desconto)";
                break;

            case 2:
                valorFinal = valorCompra * 0.96; // 4% de desconto
                tipoPagamento = "À vista no cartão (4% de desconto)";
                break;

            case 3:
                valorFinal = valorCompra; // sem desconto ou acréscimo
                tipoPagamento = "Em 2x sem juros";
                parcelas = 2;
                break;

            case 4:
                valorFinal = valorCompra * 1.08; // 8% de acréscimo
                tipoPagamento = "Em 4x com 8% de acréscimo";
                parcelas = 4;
                break;

            default:
                System.out.println("\nCódigo inválido. Tente novamente.");
                in.close();
                return;
        }

        System.out.println("\n=== Resumo do Pagamento ===");
        System.out.println("Tipo de pagamento: " + tipoPagamento);
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        if (parcelas > 1) {
            double valorParcela = valorFinal / parcelas;
            System.out.printf("Número de parcelas: %d%n", parcelas);
            System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
        }

        in.close();
    }
}
