import java.util.*;

public class GerenciamentoDeAlunos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Gerenciamento de Alunos EduTech ===");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Sair");

            int opc = ValidadorEntrada.lerInteiro(in, "Escolha: ");

            if (opc == 1) {
                String nome = ValidadorEntrada.lerTexto(in, "Nome do aluno: ");
                int matricula = ValidadorEntrada.lerInteiro(in, "Matrícula: ");

                double p1 = ValidadorEntrada.lerNota(in, "Nota P1 [0..10]: ");
                double p2 = ValidadorEntrada.lerNota(in, "Nota P2 [0..10]: ");
                double p3 = ValidadorEntrada.lerNota(in, "Nota P3 [0..10]: ");

                double t1 = ValidadorEntrada.lerNota(in, "Nota Trab 1 [0..10]: ");
                double t2 = ValidadorEntrada.lerNota(in, "Nota Trab 2 [0..10]: ");
                double t3 = ValidadorEntrada.lerNota(in, "Nota Trab 3 [0..10]: ");

                Aluno a = new Aluno(matricula, nome, p1, p2, p3, t1, t2, t3);
                alunos.add(a);

                double mediaProvas = CalculadoraMedia.mediaProvas(p1, p2, p3);
                double mediaTrabs = CalculadoraMedia.mediaTrabalhos(t1, t2, t3);
                double mediaFinal = CalculadoraMedia.mediaFinal(mediaProvas, mediaTrabs);
                String status = StatusAluno.avaliar(mediaFinal);

                Exibidor.exibirResultados(a, mediaProvas, mediaTrabs, mediaFinal, status);

            } else if (opc == 2) {
                if (alunos.isEmpty()) {
                    System.out.println("Nenhum aluno cadastrado.");
                } else {
                    System.out.println("\n--- Lista de Alunos ---");
                    for (Aluno a : alunos) {
                        double mp = CalculadoraMedia.mediaProvas(a.p1, a.p2, a.p3);
                        double mt = CalculadoraMedia.mediaTrabalhos(a.t1, a.t2, a.t3);
                        double mf = CalculadoraMedia.mediaFinal(mp, mt);
                        String st = StatusAluno.avaliar(mf);
                        Exibidor.exibirResultados(a, mp, mt, mf, st);
                    }
                }

            } else if (opc == 3) {
                System.out.println("Encerrando. Até mais!");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        in.close();
    }
}

/* --------- MODELO --------- */
class Aluno {
    final int matricula;
    final String nome;
    final double p1, p2, p3;
    final double t1, t2, t3;

    Aluno(int matricula, String nome, double p1, double p2, double p3, double t1, double t2, double t3) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1; this.p2 = p2; this.p3 = p3;
        this.t1 = t1; this.t2 = t2; this.t3 = t3;
    }
}

/* --------- VALIDAÇÃO DE ENTRADA --------- */
class ValidadorEntrada {
    static int lerInteiro(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = in.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Inteiro inválido. Tente novamente.");
            }
        }
    }

    static double lerDouble(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = in.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Número decimal inválido. Ex: 7.5");
            }
        }
    }

    static double lerNota(Scanner in, String prompt) {
        while (true) {
            double v = lerDouble(in, prompt);
            if (v >= 0.0 && v <= 10.0) return v;
            System.out.println("Fora do intervalo 0..10. Tente novamente.");
        }
    }

    static String lerTexto(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = in.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("Texto vazio não é válido.");
        }
    }
}

/* --------- CÁLCULOS --------- */
class CalculadoraMedia {
    static double mediaProvas(double p1, double p2, double p3) {
        return (p1 * 1 + p2 * 2 + p3 * 3) / 6.0;
    }

    static double mediaTrabalhos(double t1, double t2, double t3) {
        return (t1 + t2 + t3) / 3.0;
    }

    static double mediaFinal(double mediaProvas, double mediaTrabalhos) {
        return (mediaProvas + mediaTrabalhos) / 2.0;
    }
}

/* --------- STATUS --------- */
class StatusAluno {
    static String avaliar(double mediaFinal) {
        if (mediaFinal >= 6.0) return "Aprovado ";
        if (mediaFinal < 4.0) return "Reprovado ";
        return "Recuperação ";
    }
}

/* --------- EXIBIÇÃO --------- */
class Exibidor {
    static void exibirResultados(Aluno a, double mediaProvas, double mediaTrabalhos, double mediaFinal, String status) {
        System.out.println("\n--- Resultado ---");
        System.out.println("Matrícula: " + a.matricula);
        System.out.println("Aluno: " + a.nome);
        System.out.printf("Provas [P1=%.2f, P2=%.2f, P3=%.2f] → Média Provas: %.2f%n",
                a.p1, a.p2, a.p3, mediaProvas);
        System.out.printf("Trabalhos [T1=%.2f, T2=%.2f, T3=%.2f] → Média Trabalhos: %.2f%n",
                a.t1, a.t2, a.t3, mediaTrabalhos);
        System.out.printf("Média Final: %.2f | Status: %s%n", mediaFinal, status);
    }
}
