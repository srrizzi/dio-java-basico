import java.util.Scanner;

public class Desafio3
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    int number, sum = 0;
    
    number = scan.nextInt();
    
    while(number >= 0)
    {
      sum = number - (sum + number);
      System.out.println(sum);
    }
    System.out.println(sum);
  
  }
  
}
