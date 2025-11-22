import java.util.Scanner;

public class mediaAlunos {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float nota1, nota2, nota3, nota4;
    float media;
    int qtdAulasDadas, qtdAulasFaltas;
    float frequencia;

    System.out.print("Digite a nota 1: ");
    nota1 = teclado.nextFloat();
    System.out.print("Digite a nota 2: ");
    nota2 = teclado.nextFloat();
    System.out.print("Digite a nota 3: ");
    nota3 = teclado.nextFloat();
    System.out.print("Digite a nota 4: ");
    nota4 = teclado.nextFloat();

    System.out.print("Digite a quantidade de aulas dadas: ");
    qtdAulasDadas = teclado.nextInt();
    System.out.print("Digite a quantidade de aulas faltas: ");
    qtdAulasFaltas = teclado.nextInt();

    // calculo da media e do percentual de faltas

    media = (nota1 + nota2 + nota3 + nota4) / 4;
    frequencia = (qtdAulasFaltas * 100) / qtdAulasDadas;

    System.out.println("\n--------------------------------------");
    System.out.printf("Média do aluno: %.2f%n", media);
    System.out.printf("Percentual de faltas: %.1f%%%n", frequencia);
    System.out.println("--------------------------------------");

    // condições para aprovação, exame ou reprovação

    if (frequencia > 25) {
      // é executado se a condição (percentualFantas > 25) for verdadeira
      System.out.printf("Aluno reprovado por faltas5.");
    } else if (media >= 6) {
      // é executado se a condição (percentualFantas > 25) for falsa e a condição
      // (media >= 6) for verdadeira
      System.out.printf("Aluno aprovado, a média foi %.2f.", media);
    } else if (media >= 4) {
      // é executado se a condição (percentualFantas > 25) for falsa e a condição
      // (media >= 6) for falsa e a condição (media >= 4) for verdadeira
      System.out.printf("Aluno em exame, a média foi %.2f.", media);
    } else {
      // é executado se todas as condições anteriores forem falsas
      System.out.printf("Aluno reprovado, a média foi %.2f.", media);
      teclado.close();
    }
  }

}
