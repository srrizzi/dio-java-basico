public class Ex3_Mensagem
{
  public static void getMensager(int hora)
  {
    switch(hora)
    {
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
        mensagerGoodMoning();
        break;
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
        mensagerGoodAfternoon();
        break;
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
        mensagerGoodNight();
        break;
      default:
        System.out.println("Invalid Time!!");
        break;
    }
  }

  public static void mensagerGoodMoning()
  {
    System.out.println("Good Morning!");
  }
  
  public static void mensagerGoodAfternoon()
  {
    System.out.println("Good Afternoon!!");
  }

  public static void mensagerGoodNight()
  {
    System.out.println("Good Night!!!");
  }
}
