package Exercicios;
/*Escreva um programa que seja capaz de ler uma velocidade média de um veículo, 
uma distância em km e o valor do litro do combustível em reais. 
O programa deve ser capaz de dizer quantas horas será necessário para percorrer esta distância 
em km e qual o valor total de combustível que será utilizado.*/

/* entrada de dados:(Quais variaveis e quais tipos)

- velocidade media do veiculo em km (int)
- distancia em km - (int)
- valor do litro do combustivel em reais(floar]t)

 * 
 * processamento
 * 
 * saida de dados
 */

import java.util.Scanner;

public class Exerc_Velocidade_media_veiculo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); // para lero o teclado

    int velocidadeMediaVeiculo; // variavel para ler a velocidade media do veiculo
    int distancia; // variavel para ler a distancia em km
    float valorLitroCombustivel; // variavel para ler o valor do litro do combustivel
    float tempo; // variavel para calcular o tempo
    float valorTotalCombustivel; // variavel para calcular o valor total do combustivel
    float litrosConsumidos; // variavel para calcular os litros consumidos
    float consumoMedioVeiculo = 12; // variavel para o consumo medio do veiculo em km/l
    // considerando que o veiculo faz 12 km/l

    // entrada de dados
    System.out.print("Digite a velocidade media do veiculo em km/h: ");
    velocidadeMediaVeiculo = teclado.nextInt(); // ler a velocidade media do veiculo
    System.out.print("Digite a distancia em km: ");
    distancia = teclado.nextInt(); // ler a distancia em km
    System.out.print("Digite o valor do litro do combustivel em reais: ");
    valorLitroCombustivel = teclado.nextFloat(); // ler o valor do litro do combustivel em reais
    teclado.close(); // fechar o scanner

    // processamento
    tempo = distancia / velocidadeMediaVeiculo; // calcular o tempo
    litrosConsumidos = distancia / consumoMedioVeiculo; // calcular os litros consumidos
    valorTotalCombustivel = litrosConsumidos * valorLitroCombustivel; // calcular o valor total do combustivel
    // saida de dados
    System.out.printf(
        "O tempo necessario para percorrer a distancia de %d km a uma velocidade media de %d km/h e de: %.2f horas%n",
        distancia, velocidadeMediaVeiculo, tempo);
    System.out.printf("O valor total do combustivel que sera utilizado e de: R$%.2f%n", valorTotalCombustivel);
  }
}
