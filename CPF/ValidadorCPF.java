public class ValidadorCPF {

    public boolean validar(CPF cpfObj) {

        String cpf = cpfObj.getNumero();

        // Validações iniciais
        if (!cpfObj.temTamanhoValido()) return false;
        if (cpfObj.ehSequenciaRepetida()) return false;

        try {
            // ------- Cálculo do 1° dígito -------
            int soma = 0;
            int peso = 10;

            for (int i = 0; i < 9; i++) {
                int num = Character.getNumericValue(cpf.charAt(i));
                soma += num * peso--;
            }

            int resto = soma % 11;
            int digito1 = (resto < 2) ? 0 : (11 - resto);

            // ------- Cálculo do 2° dígito -------
            soma = 0;
            peso = 11;

            for (int i = 0; i < 10; i++) {
                int num = Character.getNumericValue(cpf.charAt(i));
                soma += num * peso--;
            }

            resto = soma % 11;
            int digito2 = (resto < 2) ? 0 : (11 - resto);

            // Dígitos informados
            int informado1 = Character.getNumericValue(cpf.charAt(9));
            int informado2 = Character.getNumericValue(cpf.charAt(10));

            return (digito1 == informado1 && digito2 == informado2);

        } catch (Exception e) {
            return false;
        }
    }
}
