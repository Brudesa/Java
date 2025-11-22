import java.util.Scanner;
import java.util.InputMismatchException;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Cálculo da Média Final do Aluno ===");

        // Entradas usando funções
        int matricula = lerInteiro(teclado, "Digite a matrícula do aluno: ");
        double nota1 = lerDouble(teclado, "Digite a nota da Prova 1: ");
        double nota2 = lerDouble(teclado, "Digite a nota da Prova 2: ");
        double nota3 = lerDouble(teclado, "Digite a nota da Prova 3: ");

        double trab1 = lerDouble(teclado, "Digite a nota do Trabalho 1: ");
        double trab2 = lerDouble(teclado, "Digite a nota do Trabalho 2: ");
        double trab3 = lerDouble(teclado, "Digite a nota do Trabalho 3: ");

        // Cálculos
        double mediaProvas = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3)) / 6;
        double mediaTrabalhos = (trab1 + trab2 + trab3) / 3;
        double mediaFinal = (mediaProvas + mediaTrabalhos) / 2;

        String status = avaliarStatus(mediaFinal);

        // Exibir resultado completo
        exibirResultados(matricula, mediaProvas, mediaTrabalhos, mediaFinal, status);

        teclado.close();
    }

    // ==================== FUNÇÕES E PROCEDIMENTOS ====================

    // Lê um número inteiro com validação
    static int lerInteiro(Scanner teclado, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro válido!");
                teclado.nextLine(); // limpa buffer
            }
        }
    }

    // Lê um número decimal (double) com validação
    static double lerDouble(Scanner teclado, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return teclado.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número decimal válido (ex: 7.5).");
                teclado.nextLine();
            }
        }
    }

    // Retorna o status do aluno conforme a média
    static String avaliarStatus(double mediaFinal) {
        if (mediaFinal >= 6.0)
            return "Aprovado";
        else if (mediaFinal < 4.0)
            return "Reprovado";
        else
            return "Recuperação";
    }

    // Procedimento que exibe os resultados finais
    static void exibirResultados(int matricula, double mediaProvas, double mediaTrabalhos, double mediaFinal, String status) {
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Média das provas: %.2f%n", mediaProvas);
        System.out.printf("Média dos trabalhos: %.2f%n", mediaTrabalhos);
        System.out.printf("Média final: %.2f%n", mediaFinal);
        System.out.println("Status do aluno: " + status);
        System.out.println("------------------------");
    }
}
