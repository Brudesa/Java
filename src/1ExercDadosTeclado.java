import java.util.Scanner;

public class 1ExercDadosTeclado {
  public static void main(String[] args) {
    // a linha de codigo abaixo prepara o teclado para ler os diversos tipos de
    // dados;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite seu nome:");
    teclado.nextLine();
    System.out.print("Digite o nome da sua mãe:");
    teclado.nextLine();
    System.out.print("Digite o nome do seu pai:");
    teclado.nextLine();
  }
}