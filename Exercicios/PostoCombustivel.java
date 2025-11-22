import java.util.InputMismatchException;
import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECO_ALCOOL = 3.90;
        final double PRECO_GASOLINA = 5.50;
        double litros, valorTotal = 0, desconto = 0;
        int tipo;

        try {
            System.out.println("=== POSTO JAVA ===");
            System.out.print("Informe o número de litros vendidos: ");
            litros = scanner.nextDouble();

            if (litros <= 0) {
                System.out.println("A quantidade de litros deve ser maior que zero.");
                return;
            }

            System.out.print("Informe o tipo de combustível (1 - Álcool | 2 - Gasolina): ");
            tipo = scanner.nextInt();

            if (tipo == 1) { // Álcool
                if (litros <= 20) {
                    desconto = 0.03;
                } else {
                    desconto = 0.05;
                }
                valorTotal = litros * PRECO_ALCOOL * (1 - desconto);
                System.out.printf("%nTipo: Álcool%nDesconto aplicado: %.0f%%%n", desconto * 100);
            } 
            else if (tipo == 2) { // Gasolina
                if (litros <= 20) {
                    desconto = 0.04;
                } else {
                    desconto = 0.06;
                }
                valorTotal = litros * PRECO_GASOLINA * (1 - desconto);
                System.out.printf("%nTipo: Gasolina%nDesconto aplicado: %.0f%%%n", desconto * 100);
            } 
            else {
                System.out.println("Tipo inválido! Use 1 para Álcool ou 2 para Gasolina.");
                return;
            }

            System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Digite apenas números (use ponto para decimais).");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado. Tente novamente.");
        } finally {
            scanner.close();
            System.out.println("\nEncerrando o sistema... Obrigado por usar o Posto Java!");
        }
    }
}
