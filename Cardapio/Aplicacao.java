import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cardapio cardapio = new Cardapio();
        Pedido pedido = new Pedido();

        System.out.println("🍕 Bem-vindo à Lanchonete EduTech!");

        int opcao;

        while (true) {
            cardapio.exibirMenu();
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite apenas números.");
                continue;
            }

            if (opcao == 0) {
                break;
            }

            Item itemEscolhido = cardapio.buscarItem(opcao);

            if (itemEscolhido == null) {
                System.out.println("Opção inválida. Tente novamente.");
            } else {
                pedido.adicionarItem(itemEscolhido);
            }
        }

        pedido.exibirResumo();
        in.close();
    }
}
