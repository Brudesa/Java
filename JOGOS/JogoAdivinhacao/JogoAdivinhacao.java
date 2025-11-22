import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("===  Jogo da Adivinhação ===");
        System.out.println("Escolha o nível de dificuldade:");
        System.out.println("1 - Fácil (10 tentativas, números até 50)");
        System.out.println("2 - Médio (7 tentativas, números até 100)");
        System.out.println("3 - Difícil (5 tentativas, números até 200)");
        System.out.print("Digite o número da sua escolha: ");

        int limite, tentativas;

        try {
            int nivel = scanner.nextInt();

            switch (nivel) {
                case 1 -> { limite = 50; tentativas = 10; }
                case 2 -> { limite = 100; tentativas = 7; }
                case 3 -> { limite = 200; tentativas = 5; }
                default -> {
                    System.out.println("Nível inválido! Escolha 1, 2 ou 3.");
                    scanner.close();
                    return;
                }
            }

            int numeroSecreto = random.nextInt(limite) + 1;
            boolean acertou = false;

            System.out.printf("Adivinhe o número entre 1 e %d!%n", limite);

            while (tentativas > 0) {
                System.out.printf("Tentativas restantes: %d ➤ ", tentativas);

                int palpite;
                try {
                    palpite = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite apenas números.");
                    scanner.nextLine(); // limpa entrada
                    continue;
                }

                if (palpite < 1 || palpite > limite) {
                    System.out.println("Número fora do intervalo!");
                    continue;
                }

                if (palpite == numeroSecreto) {
                    acertou = true;
                    break;
                } else if (palpite < numeroSecreto) {
                    System.out.println("🔼 Tente um número maior!");
                } else {
                    System.out.println("🔽 Tente um número menor!");
                }

                tentativas--;
            }

            if (acertou) {
                System.out.println("\n🎉 Parabéns! Você adivinhou o número secreto!");
            } else {
                System.out.printf("\n💀 Fim de jogo! O número era %d.%n", numeroSecreto);
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número válido.");
        } finally {
            scanner.close();
        }
    }
}
