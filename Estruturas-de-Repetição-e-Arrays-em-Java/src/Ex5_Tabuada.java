import java.util.Scanner;

public class Ex5_Tabuada
{
  /*
   * Desenvolva um gerador de tabuada,
   * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
   * O usuário deve informar de qual numero ele deseja ver a tabuada.
   * A Saida deve ser conforme o exemplo abaixo;
   * 
   * Tabuada de 5:
   * 5 X 1 = 5
   * 5 X 2 = 10
   * ...
   * 5 X 10 = 50
   */
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int number, i;
    
    System.out.println("Tabuada: ");
    number = scan.nextInt();

    System.out.println("Tabuada do " + number + ":");

    for(i = 0; i <= 10; i++)
    {
      System.out.println(number + " X " + i + " = " + (number * i));
    }
  }
}
