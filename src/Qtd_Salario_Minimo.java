/*Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário, 
calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.

Exemplo do Resultado:
Informe o valor do salario minimo: 1518,86
Informe o valor do salario do funcionario:4257,85

Saida:

O funcionario recebe 3,2 salarios minimos!*/

package Exercicios;

import java.util.Scanner;

public class Qtd_Salario_Minimo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe o valor do salario minimo: ");
    double salarioMinimo = teclado.nextDouble();

    System.out.print("Informe o valor do salario do funcionario: ");
    double salarioFuncionario = teclado.nextDouble();

    double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

    System.out.printf("O funcionario recebe %.2f salarios minimos!%n", quantidadeSalariosMinimos);

    teclado.close();
  }
}