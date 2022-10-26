public class TesteDosExercicios
{
  public static void main(String[] args)
  {
    // Calculadora
    System.out.println("Calculator Exercise");
    Ex1_Calculadora.sum(3, 6);
    Ex1_Calculadora.subtraction(9, 1.8);
    Ex1_Calculadora.multiplication(7, 8);
    Ex1_Calculadora.division(5, 2.5);
    
    //Mensagem
    System.out.println("Mensager Exercise");
    Ex3_Mensagem.getMensager(9);
    Ex3_Mensagem.getMensager(14);
    Ex3_Mensagem.getMensager(1);

    //Emprestimo
    System.out.println("Loan Exercise");
    Ex2_Emprestimo.calculator(1000, Ex2_Emprestimo.getTwoPortion());
    Ex2_Emprestimo.calculator(1000, Ex2_Emprestimo.getThreePortion());
    Ex2_Emprestimo.calculator(1000, 5);
  }  
}
