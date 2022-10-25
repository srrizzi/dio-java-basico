import java.util.Scanner;

public class Ex6_Fatorial
{
  /*
   * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuario.
   * Ex.: 5!= 120 (5 x 4 x 3 x 2 x 1)
   */
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int i, mult = 1;

    System.out.println("Fatorial: ");
    int factorial = scan.nextInt();

    System.out.print(factorial + "! = ");
    for(i = factorial; i >= 1; i--)
    {
      mult = mult * i;
    }
    
    System.out.println(mult);
  }
}
