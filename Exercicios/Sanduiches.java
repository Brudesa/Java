import java.util.Scanner;

public class Sanduiches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdSanduiches;
        // Os valores estão corretos
        float gramasQueijoPorSanduiche = 100.0f;
        float gramasPresuntoPorSanduiche = 50.0f;
        float gramasHamburguerPorSanduiche = 120.0f;

        float totalQueijo, totalPresunto, totalHamburguer;

        // 1 - Solicita a quantidade de sanduiches
        System.out.print("Informe a quantidade de sanduiches: ");
        qtdSanduiches = scanner.nextInt();

        // 2 - Realiza os cálculos
        totalQueijo = qtdSanduiches * gramasQueijoPorSanduiche;
        totalPresunto = qtdSanduiches * gramasPresuntoPorSanduiche;
        totalHamburguer = qtdSanduiches * gramasHamburguerPorSanduiche;

        // Converte os totais de gramas para quilos
        float totalQueijoKg = totalQueijo / 1000.0f;
        float totalPresuntoKg = totalPresunto / 1000.0f;
        float totalHamburguerKg = totalHamburguer / 1000.0f;

        // 3 - Exibe os resultados
        System.out.printf("Para produzir %d sanduiches serao necessarios:%n", qtdSanduiches);
        System.out.printf("%.2f kgs de mussarela%n", totalQueijoKg);
        System.out.printf("%.2f kgs de presunto%n", totalPresuntoKg);
        System.out.printf("%.2f kgs de hamburguer%n", totalHamburguerKg);

        scanner.close();
    }
}