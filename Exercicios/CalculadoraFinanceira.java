import java.util.Scanner;

public class CalculadoraFinanceira {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== 💰 Calculadora Financeira ===");

        double valorInicial = lerDouble(in, "Digite o valor investido (R$): ");
        double taxaMensal = lerDouble(in, "Digite a taxa de juros mensal (%): ");
        int meses = lerInteiro(in, "Digite o tempo do investimento (em meses): ");

        double montante = calcularMontante(valorInicial, taxaMensal, meses);
        double lucro = montante - valorInicial;

        exibirResultado(valorInicial, taxaMensal, meses, montante, lucro);

        in.close();
    }

    // ---------- Funções Auxiliares ----------

    // Lê número decimal, aceita ponto ou vírgula
    static double lerDouble(Scanner in, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = in.nextLine().trim().replace(",", ".");
                double valor = Double.parseDouble(entrada);
                if (valor >= 0) return valor;
                System.out.println("Valor não pode ser negativo. Tente novamente.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido (ex: 10.5).");
            }
        }
    }

    // Lê número inteiro com validação
    static int lerInteiro(Scanner in, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = in.nextLine().trim();
                int valor = Integer.parseInt(entrada);
                if (valor > 0) return valor;
                System.out.println("Digite um número de meses válido (maior que zero).");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
    }

    // Cálculo do montante com juros compostos
    static double calcularMontante(double valor, double taxaMensal, int meses) {
        double taxa = taxaMensal / 100; // converte % em decimal
        return valor * Math.pow(1 + taxa, meses);
    }

    // Exibição formatada dos resultados
    static void exibirResultado(double valorInicial, double taxaMensal, int meses, double montante, double lucro) {
        System.out.println("\n=== 📊 Resultado do Investimento ===");
        System.out.printf("Valor investido: R$ %.2f%n", valorInicial);
        System.out.printf("Taxa de juros: %.2f%% ao mês%n", taxaMensal);
        System.out.printf("Tempo: %d meses%n", meses);
        System.out.println("-------------------------------");
        System.out.printf("Montante final: R$ %.2f%n", montante);
        System.out.printf("Lucro obtido:   R$ %.2f%n", lucro);
    }
}
