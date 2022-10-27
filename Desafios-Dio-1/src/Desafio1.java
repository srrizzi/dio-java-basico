import java.util.Scanner;

public class Desafio1
{
  /*
   * Nesse desafio, dados dois números, verifique se eles são iguais.
   * Caso sejam, retorne "Sao iguais!”.
   * Caso contrário, retorne "Nao sao iguais!” sem as aspas.
   */
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    int a, b;

    a = scan.nextInt();
    b = scan.nextInt();

    if(a == b) System.out.println("São iguais!");
    else System.out.println("Não são iguais!");
  }
}
