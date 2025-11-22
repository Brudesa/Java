import java.util.InputMismatchException;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== CÁLCULO DE INGREDIENTES PARA SANDUÍCHES ===");
            System.out.print("Informe a quantidade de sanduíches: ");
            int qtdSanduiches = scanner.nextInt();

            if (qtdSanduiches <= 0) {
                System.out.println("A quantidade de sanduíches deve ser maior que zero.");
                return;
            }

            // Quantidades fixas por sanduíche
            float gramasQueijoPorSanduiche = 100.0f;
            float gramasPresuntoPorSanduiche = 50.0f;
            float gramasHamburguerPorSanduiche = 120.0f;

            // Cálculos em gramas
            float totalQueijo = qtdSanduiches * gramasQueijoPorSanduiche;
            float totalPresunto = qtdSanduiches * gramasPresuntoPorSanduiche;
            float totalHamburguer = qtdSanduiches * gramasHamburguerPorSanduiche;

            // Conversão para quilos
            float totalQueijoKg = totalQueijo / 1000.0f;
            float totalPresuntoKg = totalPresunto / 1000.0f;
            float totalHamburguerKg = totalHamburguer / 1000.0f;

            // Exibição dos resultados
            System.out.printf("%nPara produzir %d sanduíches serão necessários:%n", qtdSanduiches);
            System.out.printf("%.2f kg de mussarela%n", totalQueijoKg);
            System.out.printf("%.2f kg de presunto%n", totalPresuntoKg);
            System.out.printf("%.2f kg de hambúrguer%n", totalHamburguerKg);

        } catch (InputMismatchException e) {
            System.out.println("Erro: valor inválido. Por favor, digite apenas números inteiros.");
        } catch (Exception e) {
            System.out.println("Ops! Algo inesperado aconteceu. Tente novamente.");
            e.printStackTrace(); // apenas para depuração
        } finally {
            scanner.close();
            System.out.println("\nPrograma finalizado. Obrigado por utilizar o sistema!");
        }
    }
}
