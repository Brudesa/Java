import java.util.Scanner;

public class FolhaPagto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salarioInicial;
        float salarioReajustado;
        float descontoINSS;
        float descontoFGTS;
        float totalDescontos;
        float salarioFinal;

        // 1. Solicita o salário inicial
        System.out.print("Informe o salario: ");
        salarioInicial = scanner.nextFloat();

        // 2. Realiza os cálculos
        salarioReajustado = salarioInicial * 1.15f;
        descontoINSS = salarioReajustado * 0.11f;
        descontoFGTS = salarioReajustado * 0.08f;
        totalDescontos = descontoINSS + descontoFGTS;
        salarioFinal = salarioReajustado - totalDescontos;

        // 3. Exibe os resultados
        System.out.printf("Salario Inicial: %.2f%n", salarioInicial);
        System.out.printf("Salario Reajustado: %.2f%n", salarioReajustado);
        System.out.printf("Desconto 11%% INSS: %.2f%n", descontoINSS);
        System.out.printf("Desconto 8%% FGTS: %.2f%n", descontoFGTS);
        System.out.printf("Total Descontos INSS+FGTS: %.2f%n", totalDescontos);
        System.out.printf("Salario Final: %.2f%n", salarioFinal);
        
        scanner.close();
    }
}