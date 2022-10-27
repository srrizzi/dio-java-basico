import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Desafio5
{
  /*
   * Uma busca sequencial se caracteriza por percorrermos todos os
   * elementos de uma estrutura em busca do elemento “X” desejado. Neste
   * desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor
   * fazendo as comparações de A[N] = X. Caso a condição seja verdadeira, “X”
   * existe na estrutura e a busca será concluída com sucesso.
   * 
   * Considere um array de 10 elementos do tipo inteiro:
   * Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.
   * ● Carregue esses elementos em um array. 
   * ● Implementação da busca sequencial: 
   * ● Crie um método  que realiza uma busca sequencial. 
   * ● Se o valor constar no array, retorne um texto contendo o valor e sua
   *   respectiva posição no array. Caso contrario retorne um texto dizendo que
   *   o número não foi encontrado, conforme exemplos abaixo.
   * 
   * Entrada
   * A entrada consiste em um valor de busca e/ou array
   */
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int[] elements = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
    int result;

    result = scan.nextInt();

    search(result, elements);
 
  }

  public static void search(int x, int[] number)
  {
    int i = 0;

    for(i =0; i < number.length; i++)
    {
      if(number[i] == x)
      {
        System.out.println("Achei " + x + " na posicao " + i );
        break;
      }
    }

    if(i >= number.length) System.out.println("Numero " + x + " nao encontrado!");

  }
}
