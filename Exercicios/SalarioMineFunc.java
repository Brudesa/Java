import java.util.Scanner;
public class SalarioMineFunc {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo;
        double salarioFuncionario;
        double quantidadeSalarios;

        //3 - Solicite os valores ao usuário
        System.out.println("Informe o valor do salário mínimo: ");
        salarioMinimo = scanner.nextDouble();
        
        System.out.print("Informe o salário do funcionário: ");
        salarioFuncionario = scanner.nextDouble();

        // 4 - Realize o cálculo
        quantidadeSalarios = salarioFuncionario / salarioMinimo;

        // 5 - Exiba o resultado formatado  
        System.out.printf("O funcionário recebe %.2f salários mínimos.%n", quantidadeSalarios);


        scanner.close();
    }
}
