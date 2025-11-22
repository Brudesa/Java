import java.util.Scanner;
import java.security.SecureRandom;

public class HeroiVsVilao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SecureRandom sorteio = new SecureRandom();

        System.out.println("=== Jogo Herói x Vilão ===");
        System.out.println("Escolha sua ação:");
        System.out.println("1 - Atacar ⚔️");
        System.out.println("2 - Defender 🛡️");
        System.out.println("3 - Fugir 🏃‍♂️");
        System.out.print("Digite o número da sua escolha: ");

        int escolhaHeroi;
        try {
            escolhaHeroi = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite apenas 1, 2 ou 3.");
            teclado.close();
            return;
        }

        if (escolhaHeroi < 1 || escolhaHeroi > 3) {
            System.out.println("Escolha fora do intervalo! Digite 1, 2 ou 3.");
            teclado.close();
            return;
        }

        int escolhaVilão = sorteio.nextInt(3) + 1; // 1 a 3

        System.out.println("\n🕹️ O vilão fez sua jogada...");
        System.out.println("====================================");
        System.out.println(resultadoBatalha(escolhaHeroi, escolhaVilão));
        System.out.println("====================================");

        teclado.close();
    }

    public static String resultadoBatalha(int heroi, int vilão) {
        String acaoHeroi = traduzirAcao(heroi);
        String acaoVilão = traduzirAcao(vilão);

        System.out.println("Você escolheu: " + acaoHeroi);
        System.out.println("O vilão escolheu: " + acaoVilão + "\n");

        // Tabela de regras
        if (heroi == 1 && vilão == 1) return "Resultado da batalha: ⚔️ Os dois se ferem!";
        if (heroi == 1 && vilão == 2) return "Resultado da batalha: 🛡️ O vilão bloqueia seu ataque com um sorriso maligno!";
        if (heroi == 1 && vilão == 3) return "Resultado da batalha: 🗡️ Você acerta o vilão pelas costas enquanto ele tenta fugir!";

        if (heroi == 2 && vilão == 1) return "Resultado da batalha: 💥 Você bloqueia o ataque do vilão com maestria!";
        if (heroi == 2 && vilão == 2) return "Resultado da batalha: 🛡️ Ambos ficam em posição defensiva... ninguém se fere.";
        if (heroi == 2 && vilão == 3) return "Resultado da batalha: 🏃 O vilão foge enquanto você se protege, covarde!";

        if (heroi == 3 && vilão == 1) return "Resultado da batalha: ⚡ Você escapa por pouco do ataque do vilão!";
        if (heroi == 3 && vilão == 2) return "Resultado da batalha: 🏆 Você foge com sucesso, o vilão nem tenta seguir!";
        if (heroi == 3 && vilão == 3) return "Resultado da batalha: 😅 Ambos fogem... ninguém vence hoje.";

        return "Erro: combinação desconhecida.";
    }

    public static String traduzirAcao(int acao) {
        return switch (acao) {
            case 1 -> "Atacar ⚔️";
            case 2 -> "Defender 🛡️";
            case 3 -> "Fugir 🏃‍♂️";
            default -> "Desconhecida";
        };
    }
}
