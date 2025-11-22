import java.util.Scanner;

public class TerrenoImobiliaria {
    public static void main(String[] args) {
        // 1 - Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // 3 - Solicita a entrada de dados do usuário

        System.out.print ("Quantos metros o terreno possui de frente? ");
        double frente = scanner.nextDouble();

        System.out.print("Quantos emetros o terreno possui de lateral? ");  
        double lateral = scanner.nextDouble();

        System.out.print("Informa o valor do metro quadrado: ");
        double valorMetroQuadrado = scanner.nextDouble();

        // 4 - Realizando os cálculos

        double area = frente * lateral;
        double valorBase = area * valorMetroQuadrado;
        double valorTerreno = valorBase; //inicializa o valor do terreno com o valor base
        double valorAjuste = 0.0;
        double percentual = 0.0;
        String tipoAjuste = "";

        

        // - Condição: verificar se é quadrado

    if(frente == lateral) {
        percentual = 0.10; // 10% de acréscimo
        tipoAjuste = " valorização de 10% (terreno quadrado)";
        valorTerreno = valorBase + valorAjuste;
        System.out.println("\n O terreno é quadrado, então um acréscimo de 10% foi aplicado ao valor final.");
    }else {
        percentual = 0.02; // 2% de desconto
        tipoAjuste = " desconto de 2% (terreno não quadrado)";
        valorAjuste = valorBase * percentual;
        valorTerreno  = valorBase - valorAjuste;
        System.out.println("\n O terreno não é quadrado. Desconto de 2% aplicado ao valor final.");

        // 5 - Exibe os resultados formatados

       System.out.println("\n--------------------------------");
        System.out.printf("Dimensões do terreno: %.2f m x %.2f m%n", frente, lateral);
        System.out.printf("Área total: %.2f m²%n", area);
        System.out.printf("Valor base (sem ajuste): R$ %.2f%n", valorBase);
        System.out.printf("Ajuste aplicado: %s%n", tipoAjuste);
        System.out.printf("Valor do ajuste: R$ %.2f%n", valorAjuste);
        System.out.printf("Valor final do terreno: R$ %.2f%n", valorTerreno);
        System.out.println("--------------------------------");

        // 6 - Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
     }
    }
 }