
import java.util.Scanner;
import java.security.SecureRandom;

public class pedraPapelTesoura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SecureRandom sorteio = new SecureRandom();

        // Escolha do computador
        String escolhaComputador = "";
        int numeroSorteado = sorteio.nextInt(3); // 0, 1 ou 2

        switch (numeroSorteado) {
            case 0:
                escolhaComputador = "tesoura";
                break;
            case 1:
                escolhaComputador = "pedra";
                break;
            case 2:
                escolhaComputador = "papel";
                break;
        }

        // Escolha do jogador
        System.out.println("Escolha: pedra, papel ou tesoura");
        String escolhaJogador = teclado.nextLine().toLowerCase().trim();

        System.out.println("Computador escolheu: " + escolhaComputador);

        // Lógica do jogo
        if (escolhaJogador.equals(escolhaComputador)) {
            System.out.println("Empate!");
        } else if (
            (escolhaJogador.equals("pedra") && escolhaComputador.equals("tesoura")) ||
            (escolhaJogador.equals("papel") && escolhaComputador.equals("pedra")) ||
            (escolhaJogador.equals("tesoura") && escolhaComputador.equals("papel"))
        ) {
            System.out.println("Você venceu!");
        } else if (
            escolhaJogador.equals("pedra") ||
            escolhaJogador.equals("papel") ||
            escolhaJogador.equals("tesoura")
        ) {
            System.out.println("Computador venceu!");
        } else {
            System.out.println("Entrada inválida. Escolha apenas pedra, papel ou tesoura.");
        }

        teclado.close();
    }
}
