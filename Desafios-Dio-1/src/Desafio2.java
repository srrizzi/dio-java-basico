import java.util.Scanner;

public class Desafio2
{
  /*
   * Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
   */
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int number, limit, result, mult, sum;

    number = scan.nextInt();  //numero selecionado
    limit = scan.nextInt();   //limite

    mult = limit / number;
    sum = mult * (mult + 1) / 2;
    result = number * sum;

    System.out.println(result);


    
  }
  
}
