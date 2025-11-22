import java.util.Scanner;
import java.util.InputMismatchException;

public class faixaSalarial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float salario = obterValorFloat(teclado, "Digite o salário atual do funcionário: ");
        float percentual = obterPercentualAumento(salario);
        exibirResultado(salario, percentual);

        teclado.close();
    }

    // Função que lê e retorna um valor float
    static float obterValorFloat(Scanner teclado, String mensagem) {
        float valor = 0f;

        try {
            System.out.print(mensagem);
            valor = teclado.nextFloat();
            teclado.nextLine(); // limpa o buffer
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número válido (ex: 2500.50).");
            System.exit(1); // encerra o programa em caso de erro
        }

        return valor;
    }

    // Função que define o percentual de aumento com base no salário
    static float obterPercentualAumento(float salario) {
        float percentual;

        if (salario <= 1000) {
            percentual = 0.15f; // 15%
        } else if (salario <= 2000) {
            percentual = 0.10f; // 10%
        } else {
            percentual = 0.05f; // 5%
        }

        return percentual;
    }

    // Procedimento que mostra o resultado
    static void exibirResultado(float salario, float percentual) {
        float aumento = salario * percentual;
        float novoSalario = salario + aumento;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Salário atual: R$ %.2f%n", salario);
        System.out.printf("Percentual de aumento: %.0f%%%n", percentual * 100);
        System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
    }
}
