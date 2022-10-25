import java.util.Scanner;

public class Ex2_Nota 
{
  /*
   * Faça um programa que peça uma nota, entre zero e dez.
   * Mostre uma mensagem caso o valor seja inválido
   * e continue pedindo
   */
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int note;

    while(true)
    {
      System.out.print("Digite um valor: ");
      note = scan.nextInt();

      if(note >= 0 && note <= 10)break;
      
      System.out.println("Valor invalido");
    }
    
    System.out.print("Valor valido");

    /*
     * Essa forma é a feita pela a prof.
     * 
     * System.out.println("Nota: ");
     * nota = scan.nextInt();
     * 
     * while(nota < 0 | nota > 10)
     * {
     *    System.out.println("Nota Inválida! Digite novamente: ")
     *    nota = scan.nextInt();
     * }
     */
  }
}
