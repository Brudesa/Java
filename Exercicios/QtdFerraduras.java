import java.util.Scanner;

public class QtdFerraduras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeCavalos;
        int quantidadeFerraduras;
        float valorCadaFerradura;

        // 1 - Solicite os valores ao usuário
        System.out.print("Informe a quantidade de cavalos: ");
        quantidadeCavalos = scanner.nextInt();

        System.out.print("informe o valor de cada ferradura: ");
        valorCadaFerradura = scanner.nextFloat();  

        // 2 - Realize o cálculo
        quantidadeFerraduras = quantidadeCavalos * 4;
        float valorTotalFerraduras = quantidadeFerraduras * valorCadaFerradura;
        System.out.printf("O total de ferraduras necessárias é: %d%n", quantidadeFerraduras);
        System.out.printf("O valor total gasto com ferraduras é: R$ %.2f%n", valorTotalFerraduras);

        scanner.close();
    }
}