import java.util.Scanner;

public class Granja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdFrangos;
        float custoChipIdentificacao = 4.00f;
        float custoAnelAlimentacao = 3.50f;

        // 1. Solicita a quantidade de frangos
        System.out.print("Informe a quantidade de frangos: ");
        qtdFrangos = scanner.nextInt();

        // 2. Realiza os cálculos
        float custoTotalIdentificacao = qtdFrangos * custoChipIdentificacao;
        float custoTotalAlimentacao = qtdFrangos * 2 * custoAnelAlimentacao;
        float custoTotalGranja = custoTotalIdentificacao + custoTotalAlimentacao;

        // 3. Exibe os resultados
        System.out.printf("Custo Total com Identificação: R$ %.2f%n", custoTotalIdentificacao);
        System.out.printf("Custo Total com Alimentação: R$ %.2f%n", custoTotalAlimentacao);
        System.out.printf("Custo Total da Granja: R$ %.2f%n", custoTotalGranja);

        scanner.close();
    }
}