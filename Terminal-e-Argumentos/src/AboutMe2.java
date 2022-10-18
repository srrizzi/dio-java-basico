import java.util.Locale;
import java.util.Scanner;

public class AboutMe2
{
  public static void main(String[] args)
  {
    //Criando o Objeto Scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Enter your Name: ");
    String name = scanner.next();

    System.out.println("Enter your Last Name:");
    String lastName = scanner.next();

    System.out.println("Enter your Age: ");
    int age = scanner.nextInt(); 

    System.out.println("Enter your Height: ");
    double height = scanner.nextDouble();

    System.out.println("|------------------------------|");
    
    //Imprimindo os dados
    System.out.println("Hello, my name is " + name + " " + lastName);
    System.out.println("I'm " + age + " years old!");
    System.out.println("My height is " + height + " cm.");
    
  }
}
