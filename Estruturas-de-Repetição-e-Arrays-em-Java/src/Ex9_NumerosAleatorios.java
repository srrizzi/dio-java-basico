import java.util.Random;

public class Ex9_NumerosAleatorios
{
  /*
   * Faça um Programa que leia 20 numeros inteiros aleatorios (entre 0 a 100) armazene-os num vetor.
   * Ao Final mostre os numeros e seus sucessores.
   */
  public static void main(String[] args)
  {
    Random random = new Random();

    int[] numerosAleatorios = new int[20];

    for(int i = 0; i < numerosAleatorios.length; i++)
    {
      int numero = random.nextInt(100);
      numerosAleatorios[i] = numero;
    }


    System.out.print("Numeros Aleatorios: ");
    for(int numero : numerosAleatorios)
    {
      System.out.print(numero + " ");
    }

    System.out.print("\nSucessores dos Numeros Aleatorios: ");
    for(int numero : numerosAleatorios)
    {
      System.out.print((numero + 1) + " ");
    }

    System.out.print("\nAntecessor dos Numeros Aleatorios: ");
    for(int numero : numerosAleatorios)
    {
      System.out.print((numero - 1) + " ");
    }
  }
}
