package sobrecarga;

public class Quadrilatero
{
  public static void area(double lado)
  {
    System.out.println("Area do quadrado: " + lado * lado);
  }

  public static void area(double base, double altura)
  {
    System.out.println("Area do retângulo: " + base * altura);
  }

  public static void area(double baseMaior, double baseMenor, double altura)
  {
    System.out.println("Area do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
  }

  public static void area(float diagonalMaior, float diagonalMenor)
  {
    System.out.println("Area do losango: " + (diagonalMaior * diagonalMenor) / 2);
  }
}
