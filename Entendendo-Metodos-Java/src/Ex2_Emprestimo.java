public class Ex2_Emprestimo
{
  public static int getTwoPortion()
  {
    return 2;
  }

  public static int getThreePortion()
  {
    return 3;
  }

  public static double getTaxTwoPortion()
  {
    return 0.3;
  }

  public static double getTaxThreePortion()
  {
    return 0.45;
  }

  public static void calculator(double value, int portion)
  {
    if(portion == 2)
    {
      double valueFinal = value + (value * getTaxTwoPortion());
      System.out.println("Final loan amount for TWO installments: $ " + valueFinal);
    }
    else if(portion == 3)
    {
      double valueFinal = value + (value * getTaxThreePortion());
      System.out.println("Final loan amount for THREE installments: $ " + valueFinal);
    }
    else
    {
      System.out.println("Quantities of non-valid installments");
    }
  }
}
