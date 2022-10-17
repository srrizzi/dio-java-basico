public class Operadores
{
  public static void main(String[] args)
  {
    //Operadores 2
    /*
    String nomeCompleto = "Linguegem" + " " + "Java";
    System.out.print(nomeCompleto);

    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1";
    System.out.print(concatenacao);

    concatenacao = 1 + "1" + 1 + 1;
    System.out.print(concatenacao);

    concatenacao = 1 + "1" + 1 + "1";
    System.out.print(concatenacao);

    concatenacao = "1" + 1 + 1 + 1;
    System.out.print(concatenacao);

    concatenacao = "1" + (1 + 1 + 1);
    System.out.print(concatenacao);
    */

    // Operadores 3
    /* 
    int numero = 5;
    
    numero = - numero;
    System.out.print(numero);

    numero = numero * -1;
    System.out.print(numero);

    numero++;
    System.out.print(numero);

    numero--;
    System.out.print(numero);
    */

    //Operadores 4
    /* 
    boolean variavel = true;
    System.err.println(variavel);

    variavel = !variavel;
    System.err.println(variavel);
    */

    //Operadores 5
    /*
    int a, b;
    a = 5;
    b = 6;

    String result = a == b ? "Verdadeiro" : "Falso";
     
    String result = "";

    a = 5;
    b = 10;

    if(a == b)
      result = "Verdadeiro";
    else
      result = "Falso";
    

    System.out.print(result);
    */

    //Operadores 6
    /* 
    int number1 = 1;
    int number2 = 2;

    boolean yesNo = number1 == number2;
    System.out.println(number1 + " é igual a " + number2 + "? " + yesNo);

    yesNo = number1 != number2;
    System.out.println(number1 + " é diferente de " + number2 + "? " + yesNo);

    yesNo = number1 > number2;
    System.out.println(number1 + " é maior que " + number2 + "? " + yesNo);

    yesNo = number1 < number2;
    System.out.println(number1 + " é menor que " + number2 + "? " + yesNo);
    */

    //Operadores 7
    boolean condition1 = true;
    boolean condition2 = true;

    if(condition1 && condition2)
    {
      System.out.println("As duas condições são verdadeiras.");
    }

    if(condition1 || condition2)
    {
      System.out.println("Uma das duas condições é verdadeiras.");
    }
    
    System.out.println("Fim");

  }
}
