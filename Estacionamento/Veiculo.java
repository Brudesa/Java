public class Veiculo {
    private String placa;
    private int minutosPermanencia;

    public Veiculo(String placa, int minutosPermanencia) {
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutosPermanencia() {
        return minutosPermanencia;
    }
}
