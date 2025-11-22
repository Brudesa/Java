public class CalculadoraEstacionamento {

    public double calcularValor(Veiculo veiculo) {
        int minutos = veiculo.getMinutosPermanencia();

        if (minutos <= 60) {
            return 5.0;
        } else if (minutos <= 180) {
            return 10.0;
        } else {
            int minutosExtras = minutos - 180;
            int horasExtras = (int) Math.ceil(minutosExtras / 60.0);
            return 10.0 + (horasExtras * 2.0);
        }
    }

    public String mensagem(Veiculo veiculo) {
        int minutos = veiculo.getMinutosPermanencia();

        if (minutos <= 60) return "Você ficou pouco tempo, volte sempre!";
        if (minutos <= 180) return "Estadia moderada, obrigado pela preferência!";
        return "Ficou bastante tempo! Desconto especial na próxima!";
    }
}
