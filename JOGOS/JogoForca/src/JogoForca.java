import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class JogoForca {

    // Método auxiliar: retorna o desenho da forca com base nas vidas restantes
    public static String desenharForca(int vidas) {
        switch (vidas) {
            case 6:
                return """
                        +---+
                        |   |
                        O   |
                            |
                            |
                            |
                        ========""";
            case 5:
                return """
                        +---+
                        |   |
                        O   |
                        |   |
                            |
                            |
                        ========""";
            case 4:
                return """
                        +---+
                        |   |
                        O   |
                       /|   |
                            |
                            |
                        ========""";
            case 3:
                return """
                        +---+
                        |   |
                        O   |
                       /|\\  |
                            |
                            |
                        ========""";
            case 2:
                return """
                        +---+
                        |   |
                        O   |
                       /|\\  |
                       /    |
                            |
                        ========""";
            case 1:
                return """
                        +---+
                        |   |
                        O   |
                       /|\\  |
                       / \\  |
                            |
                        ========""";
            default:
                return """
                        +---+
                        |   |
                        O   |
                       /|\\  |
                       / \\  |
                            |
                        ========""";
        }
    }

    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();

        // Tenta ler o arquivo de palavras
        try {
            File arquivo = new File("D:\\PROJETOS\\MESTRA\\JAVA\\JOGOS\\JogoForca\\src\\palavras.txt");
            Scanner leitor = new Scanner(arquivo);

            // Lê cada linha do arquivo e adiciona na lista
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine().trim();
                if (!linha.isEmpty()) {
                    palavras.add(linha.toLowerCase());
                }
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo 'palavras.txt' não encontrado.");
            return;
        }

        // Verifica se o arquivo tem palavras
        if (palavras.isEmpty()) {
            System.out.println("Erro: o arquivo não contém palavras válidas.");
            return;
        }

        // Escolhe uma palavra aleatória
        Random random = new Random();
        String palavraSecreta = palavras.get(random.nextInt(palavras.size()));

        // Cria arrays e variáveis de controle
        char[] letrasDescobertas = new char[palavraSecreta.length()];
        ArrayList<Character> letrasErradas = new ArrayList<>();
        int vidas = 6;

        // Preenche o array com underlines
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }

        Scanner teclado = new Scanner(System.in);

        System.out.println("Jogo da Forca iniciado!");
        System.out.println("Você tem " + vidas + " vidas.");
        System.out.println("A palavra secreta tem " + palavraSecreta.length() + " letras.");

        // Loop principal do jogo
        while (vidas > 0) {
            System.out.println("\n" + desenharForca(vidas)); // Mostra o desenho da forca
            System.out.println("\nPalavra: " + String.valueOf(letrasDescobertas));
            System.out.println("Vidas restantes: " + vidas);
            System.out.print("Letras erradas: ");
            for (char c : letrasErradas) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Digite uma letra: ");
            String entrada = teclado.nextLine().toLowerCase();

            // Valida se é uma única letra
            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("Entrada inválida. Digite apenas uma letra.");
                continue;
            }

            char letra = entrada.charAt(0);

            // Verifica se já tentou essa letra
            if (letrasErradas.contains(letra) || new String(letrasDescobertas).indexOf(letra) != -1) {
                System.out.println("Você já tentou essa letra. Escolha outra.");
                continue;
            }

            // Verifica se a letra está na palavra
            boolean acertou = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    letrasDescobertas[i] = letra;
                    acertou = true;
                }
            }

            // Atualiza vidas e listas de letras
            if (acertou) {
                System.out.println("Acertou! A letra '" + letra + "' está na palavra.");
            } else {
                vidas--;
                letrasErradas.add(letra);
                System.out.println("Errou! A letra '" + letra + "' não existe na palavra.");
            }

            // Verifica vitória
            if (String.valueOf(letrasDescobertas).equals(palavraSecreta)) {
                System.out.println("\nParabéns! Você ganhou!");
                System.out.println("A palavra era: " + palavraSecreta);
                teclado.close();
                return;
            }
        }

        // Se sair do loop, o jogador perdeu
        System.out.println("\nFim de jogo! Suas vidas acabaram.");
        System.out.println("A palavra era: " + palavraSecreta);
        teclado.close();
    }
}
