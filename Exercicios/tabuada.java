import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Informe o número para o cálculo da tabuada: ");
        numero = teclado.nextInt();

        System.out.println("\nTabuada do + e - para o número " + numero);

        // Tabuada de soma e subtração
        for (int i = 0; i <= 9; i++) {
            calcularSomaSubtracao(numero, i);
        }

        System.out.println("\nTabuada do * e / para o número " + numero);

        // Tabuada de multiplicação e divisão
        for (int i = 0; i <= 9; i++) {
            calcularMultiplicacaoDivisao(numero, i);
        }

        teclado.close();
    }

    // Procedimento de soma e subtração
    static void calcularSomaSubtracao(int valor1, int valor2) {
        System.out.printf("%d + %d = %d \t\t %d - %d = %d%n",
                valor1, valor2, valor1 + valor2, valor1, valor2, valor1 - valor2);
    }

    // Procedimento de multiplicação e divisão
    static void calcularMultiplicacaoDivisao(int valor1, int valor2) {
        if (valor2 == 0) {
            System.out.printf("%d * %d = %d \t\t %d / %d = divisão inválida%n",
                    valor1, valor2, valor1 * valor2, valor1, valor2);
        } else {
            System.out.printf("%d * %d = %d \t\t %d / %d = %.2f%n",
                    valor1, valor2, valor1 * valor2, valor1, valor2, (float) valor1 / valor2);
        }
    }
}
