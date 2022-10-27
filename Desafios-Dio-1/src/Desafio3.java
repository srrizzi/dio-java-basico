import java.util.Scanner;

public class Desafio3 
{
  /*
   * Neste desafio, receba um número inteiro N,
   * calcule e imprima o somatório de todos os números de N até 0. 
   */
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    int number, sum = 0;
    
    number = scan.nextInt();
    
    while(number >= 0)
    {
      sum = sum + number;
      number--;
    }
    System.out.println(sum);
  
  }  
}
