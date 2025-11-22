public class CPF {

    private final String numero;

    public CPF(String numero) {
        this.numero = numero.replaceAll("\\D", ""); // remove pontos e traços
    }

    public String getNumero() {
        return numero;
    }

    public boolean temTamanhoValido() {
        return numero.length() == 11;
    }

    public boolean ehSequenciaRepetida() {
        return numero.chars().distinct().count() == 1;
    }
}
