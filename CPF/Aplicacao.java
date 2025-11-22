import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF (apenas números): ");
        String entrada = scanner.nextLine().trim();

        CPF cpf = new CPF(entrada);
        ValidadorCPF validador = new ValidadorCPF();

        if (validador.validar(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }

        scanner.close();
    }
}
