import java.security.Principal;
import java.util.Scanner;

public class Ex4_ParEImpar
{
  /*
   * Faça um programa que peça N números inteiros,
   * calcule e mostre a quantidade de números pares
   * e a quantidade de números impares
   */
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int quantityNumbers, pair = 0, odd = 0, number, i = 0;

    System.out.println("Quantos números deseja: ");
    quantityNumbers = scan.nextInt();

    do
    {
      System.out.println("Digite um numero: ");
      number = scan.nextInt();

      if(number % 2 == 0)pair++;
      else odd++;

      i++;
    }
    while(i != quantityNumbers);
    
    System.out.println("Foram " + pair + " pares e " + odd + " impares");

  }  
}
