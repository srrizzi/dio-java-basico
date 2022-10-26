public class Ex7_OrdemInversa
{
  /*
   * Crie um vetor de 6 números inteiros
   * e mostre-os na ordem inversa.
   */
  public static void main(String[] args)
  {
    int[] vetor = {0, 5, 10, 15, 20, 25};
    int i = 0, j = 0;


    System.out.println("Vetor: ");
    while(i <= (vetor.length - 1))
    {
      System.out.print(vetor[i] + " ");
      i++;

    }

    System.out.println("");
    System.out.println("Vetor Inverso: ");
    for(j = (vetor.length - 1); j >= 0; j--)
    {
      System.out.print(vetor[j] + " ");
    }
  }
}
