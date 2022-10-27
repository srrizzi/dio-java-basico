import java.util.Scanner;

public class Desafio4 
{
  /*
   * Neste desafio, você terá que criar uma função que faça um número como argumento e retorne
   * "Fizz", "Buzz" ou "FizzBuzz".
   *  
   *  Entrada
   * 
   *  Você receberá um número onde: 
   *  Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ;
   *  Se o número for apenas múltiplo de 3 -> "Fizz" ;
   *  Se o número for apenas múltiplo de 5 -> "Buzz";
   *  Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido;
   */
  public static void main(String[] args)
  {
    Scanner number = new Scanner(System.in);

    int num = number.nextInt();

    if(num % 3 == 0 && num % 5 == 0) mult3e5();
    else if(num % 3 == 0) mult3();
    else if(num % 5 == 0) mult5();
    else System.out.println(num);
    
    
  }

  public static void mult3e5()
  {
    System.out.println("FizzBuzz");
  }
  public static void mult3()
  {
    System.out.println("Fizz");
  }
  public static void mult5()
  {
    System.out.println("Buzz");
  }

}
