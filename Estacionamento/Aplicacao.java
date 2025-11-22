import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("=== Estacionamento Inteligente ===");

        System.out.print("Digite a placa do veículo: ");
        String placa = in.nextLine().trim();

        int minutos = 0;
        while (true) {
            System.out.print("Digite o tempo de permanência em minutos: ");
            try {
                minutos = Integer.parseInt(in.nextLine());
                if (minutos <= 0) {
                    System.out.println("Valor inválido. Insira um número positivo.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite apenas números.");
            }
        }

        Veiculo veiculo = new Veiculo(placa, minutos);
        CalculadoraEstacionamento calc = new CalculadoraEstacionamento();

        double valorFinal = calc.calcularValor(veiculo);
        String mensagemFinal = calc.mensagem(veiculo);

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Tempo: " + minutos + " minutos");
        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);
        System.out.println("Mensagem: " + mensagemFinal);

        in.close();
    }
}
