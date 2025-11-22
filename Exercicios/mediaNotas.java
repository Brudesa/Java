import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a primeira nota: ");
            String entrada1 = scanner.nextLine().trim();

            System.out.print("Digite a segunda nota: ");
            String entrada2 = scanner.nextLine().trim();

            // Aceita vírgula ou ponto como separador decimal
            double nota1 = Double.parseDouble(entrada1.replace(',', '.'));
            double nota2 = Double.parseDouble(entrada2.replace(',', '.'));

            double media = (nota1 + nota2) / 2.0;

            // Imprime com duas casas decimais
            System.out.printf("A média das notas é: %.2f%n", media);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor inválido. Por favor, insira um número válido.");
            System.out.println("Dica: use apenas números. Se preferir vírgula, eu aceito também.");
        } catch (Exception e) {
            // Guarda-costas genérico contra exceções não previstas
            System.out.println("Ops, algo inesperado aconteceu. Tente executar o programa novamente.");
        } finally {
            scanner.close();
        }
    }
}
