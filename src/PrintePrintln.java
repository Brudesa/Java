
/*Em Java, System.out.print e System.out.println são usados para imprimir texto 
no console, mas há uma diferença fundamental entre eles.
Diferença Principal:

System.out.print: Imprime o texto, mas não adiciona uma nova linha no exibição dos dados 
na console. 
Isso significa que o próximo texto impresso será mostrado na mesma linha na console.

System.out.println: Imprime o texto e, em seguida, adiciona uma nova linha na console. 
Isso significa que o próximo texto impresso será mostrado na linha seguinte.
A seguir vou demonstrar exemplos de ambos os métodos:
 */
public class PrintePrintln {
  public static void main(String[] args) {
    System.out.println("Hello,");
    System.out.println("World!");

    // Combinando System.out.print e System.out.println:
    System.out.print("Hello, ");
    System.out.println("World!");
  }
}
/*
 * Resumo:
 * Use System.out.print quando quiser que o texto seja impresso na mesma linha.
 * Use System.out.println quando quiser que o texto seja impresso e movido para
 * a próxima linha.
 */