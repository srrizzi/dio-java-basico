import java.util.Scanner;

public class Ex1_NomeEIdade
{
  /*
   * Faça um programa que leia conjuntos de dois valores,
   * o primeiro representando o nome do aluno e o segundo representando a sua idade.
   * (Pare o programa inserindo o Valor 0 no campo nome)
   */
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    String name;
    int age;

    while(true)
    {
      System.out.print("Digite seu nome ou 0 para encerrar o programa: ");
      name = scan.next();

      if(name.equals("0"))break;

      System.out.print("Digite sua idade: ");
      age = scan.nextInt();
      
    }
    
    System.out.print("Final Program.");
    
  }
}
