import java.util.Scanner;

public class validadorCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF (apenas números): ");
        String cpf = scanner.nextLine().trim();

        if (isCPFValido(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }

        scanner.close();
    }

    public static boolean isCPFValido(String cpf) {
        // Remove pontos e traços, se o usuário digitar com máscara
        cpf = cpf.replace(".", "").replace("-", "");

        // Verifica se tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se é uma sequência repetida (11111111111 etc.)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            // Calcular o primeiro dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                int num = Character.getNumericValue(cpf.charAt(i));
                soma += num * (10 - i);
            }

            int resto = soma % 11;
            int primeiroDigito = (resto < 2) ? 0 : (11 - resto);

            // Calcular o segundo dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                int num = Character.getNumericValue(cpf.charAt(i));
                soma += num * (11 - i);
            }

            resto = soma % 11;
            int segundoDigito = (resto < 2) ? 0 : (11 - resto);

            // Compara com os dois últimos dígitos do CPF
            int digito1Informado = Character.getNumericValue(cpf.charAt(9));
            int digito2Informado = Character.getNumericValue(cpf.charAt(10));

            return (primeiroDigito == digito1Informado && segundoDigito == digito2Informado);

        } catch (NumberFormatException e) {
            return false;
        }
    }
}
