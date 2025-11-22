import java.util.Scanner;

public class 2ExercDadosTeclado {
  public static void main(String[] args) {
    // declaração da variável 'teclado'
    Scanner teclado = new Scanner(System.in);
    // Todas as perguntas em uma unica linha de instrução
    System.out.println("Digite o nome do seu animal de estimação, Qual a idade desse animal, Esse animal tem pelo");
    // leitura e armazenamento dos dados
    // O método next( lê a próxima palavra/token.
    String nomeAnimal = teclado.next();
    // O método nextInt(lê o próximo número inteiro.)
    int idadeAnimal = teclado.nextInt();
    // O método nextBoolean(lê o próximo valor booleano (true ou false).)
    boolean temPelo = teclado.nextBoolean();
    // Imprime o resumo no console
    System.out.print("Você informou os seguintes valores:");
    System.out.print(" Nome do animal:" + nomeAnimal);
    System.out.print(" Idade do animal:" + idadeAnimal);
    System.out.print(" Animal tem pelo:" + temPelo);

    // Como boa prática, vou fechar o scanner para liberar os recursos do sistema
    teclado.close();
  }

}
