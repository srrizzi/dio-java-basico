import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;

public class Ex3_MaiorEMedia
{
  /*
   * Faça um programa que leia 5 números
   * e informe o maior número
   * e a media deles.
   */
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int i = 0, number, larger = 0, sum = 0;

    do
    {
      System.out.print("Digite um número: ");
      number = scan.nextInt();
      
      sum = sum + number;

      if(number > larger) larger = number;

      i++;
    }
    while(i != 5);

    System.out.println("O maior numero é: " + larger);
    System.out.println("A media dos numero é: " + (sum / 5));

  }  
}
