package sobrecarga;

public class TesteSobrecarga
{
  public static void main(String[] args)
  {
    System.out.println("Exercicio Sobregarga");
    //Quadrado
    Quadrilatero.area(3);

    //Retangulo
    Quadrilatero.area(5, 5);

    //Trapézio
    Quadrilatero.area(7, 8, 9);

    //Losango
    Quadrilatero.area(7f, 10f); 
  }  
}
