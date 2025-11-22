
/*Uma imobiliária vende apenas terrenos retangulares. 
Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo. 
Para isto será necessário o usuário informar as dimensões em metros (frente e lateral) 
do terreno além do valor cobrado pelo metro quadrado. 
Exemplos de saida:
Quantos metros o rerreno possui de frente:12.5
Quantos metros o terreno possui de lateral: 25.5
Informe o valor do metro quadrado: 253.20
Area total do terreno de 12.50 mts de frente com 25.50 mts de lateral e: 318.75 mts
O valor desde terreno e: R$75001.88
*/
import java.util.Scanner;

public class Exerc_valor_area_terreno {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float frente;
    float lateral;
    float valorMetroQuadrado;
    float areaTerreno;
    float valorTerreno;

    System.out.println("Quantos metros o terreno possui de frente: ");
    frente = teclado.nextFloat();
    System.out.println("Quantos metros o terreno possui de lateral: ");
    lateral = teclado.nextFloat();
    System.out.println("Informe o valor do metro quadrado: ");
    valorMetroQuadrado = teclado.nextFloat();
    teclado.close();

    areaTerreno = frente * lateral;
    valorTerreno = areaTerreno * valorMetroQuadrado;

    // CORREÇÃO: Usando printf para formatar a saída
    System.out.printf("Area total do terreno de %.2f mts de frente com %.2f mts de lateral e: %.2f mts%n", frente,
        lateral, areaTerreno);

    // CORREÇÃO: Usando printf para formatar a saída
    System.out.printf("O valor deste terreno e: R$%.2f%n", valorTerreno);
  }
}