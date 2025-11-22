import java.util.tecladoner;

public class LeituraDadosTeclado {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // No codigo abaixo ele vai ler a linha toda, inclusive os espaços

    System.out.println("Digite seu nome completo:");
    String nomeCompleto = teclado.nextLine();
    System.out.println("Seu nome completo é:" + nomeCompleto);

    // Nessa parte do codigo, ele vai ler apenas uma parte especifica do texto
    System.out.println("Digite seu primeiro nome:");
    String primeiroNome = teclado.next();
    /*
     * Limpar o restante da linha do buffer , lendo e descartando o que sobrou
     * para evitar problemas na próxima leitura
     */
    teclado.nextLine();
    System.out.println("Seu primeiro nome é:" + primeiroNome);

    // Agora vamos ler a idade
    System.out.println("Digite a sua idade:");
    int idade = teclado.nextInt();
    System.out.println("Sua idade é:" + idade);

  }
}
