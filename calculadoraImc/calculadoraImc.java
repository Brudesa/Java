import java.util.Scanner;

public class calculadoraImc {
  public static void main(String[] args) {
    // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    double peso = 0.0;
    double altura = 0.0;
    double imc = 0.0;

    System.out.println("==== CALCULADORA DE IMC ====");

    try {
      // Solicita o peso e a altura do usuário
      System.out.print("Informe seu peso (em kg): ");
      peso = scanner.nextDouble();

      System.out.print("Informe sua altura (em metros): ");
      altura = scanner.nextDouble();

      // Verifica se os valores informados são válidos
      if (peso <= 0 || altura <= 0) {
        System.out.println("Erro: peso e altura devem ser valores positivos.");
        scanner.close();
        return;
      }

      // Calcula o IMC
      imc = peso / (altura * altura);

      // Exibe o valor calculado com duas casas decimais
      System.out.printf("%nSeu IMC é: %.2f%n", imc);

      // Classifica o IMC segundo a tabela da OMS
      System.out.print("Classificação: ");
      if (imc < 18.5) {
        System.out.println("Abaixo do peso");
      } else if (imc < 25.0) {
        System.out.println("Peso normal");
      } else if (imc < 30.0) {
        System.out.println("Sobrepeso");
      } else if (imc < 35.0) {
        System.out.println("Obesidade grau I");
      } else if (imc < 40.0) {
        System.out.println("Obesidade grau II");
      } else {
        System.out.println("Obesidade grau III (obesidade mórbida)");
      }

    } catch (Exception e) {
      // Captura erro caso o usuário digite algo inválido
      System.out.println("Erro: entrada inválida. Por favor, insira números válidos para peso e altura.");
    } finally {
      // Fecha o Scanner
      scanner.close();
      System.out.println("\nPrograma finalizado.");
    }
  }
}
