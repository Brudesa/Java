import java.util.Scanner;

public class SistemaNotas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== 🎓 Sistema de Notas com Média Ponderada ===");

        double prova1 = lerNota(in, "Digite a nota da Prova 1: ");
        double prova2 = lerNota(in, "Digite a nota da Prova 2: ");
        double prova3 = lerNota(in, "Digite a nota da Prova 3: ");
        double trab1 = lerNota(in, "Digite a nota do Trabalho 1: ");
        double trab2 = lerNota(in, "Digite a nota do Trabalho 2: ");

        double mediaProvas = calcularMediaProvas(prova1, prova2, prova3);
        double mediaTrabalhos = (trab1 + trab2) / 2.0;

        double mediaFinal = (mediaProvas * 0.6) + (mediaTrabalhos * 0.4);
        String status = avaliarStatus(mediaFinal);

        exibirResultado(mediaProvas, mediaTrabalhos, mediaFinal, status);

        in.close();
    }

    // ---------- Funções Auxiliares ----------

    static double lerNota(Scanner in, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = in.nextLine().trim().replace(",", ".");
                double nota = Double.parseDouble(entrada);
                if (nota >= 0 && nota <= 10) return nota;
                System.out.println("Nota deve estar entre 0 e 10. Tente novamente.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido (ex: 8.5).");
            }
        }
    }

    static double calcularMediaProvas(double p1, double p2, double p3) {
        return (p1 + p2 + p3) / 3.0;
    }

    static String avaliarStatus(double mediaFinal) {
        if (mediaFinal >= 6.0)
            return "Aprovado ✅";
        else if (mediaFinal >= 4.0)
            return "Recuperação ⚠️";
        else
            return "Reprovado ❌";
    }

    static void exibirResultado(double mediaProvas, double mediaTrabalhos, double mediaFinal, String status) {
        System.out.println("\n=== 📊 Resultado Final ===");
        System.out.printf("Média das Provas: %.2f%n", mediaProvas);
        System.out.printf("Média dos Trabalhos: %.2f%n", mediaTrabalhos);
        System.out.println("----------------------------");
        System.out.printf("Média Final: %.2f%n", mediaFinal);
        System.out.printf("Status: %s%n", status);
    }
}
