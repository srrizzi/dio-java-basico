public class RodarAplicacao 
{
  public static void main(String[] args)
  {
    Carro carro1 = new Carro();

    carro1.setCor("Azul");
    carro1.setModelo("BMW Série 3");
    carro1.setTanqueGasolina(59);

    System.out.println(carro1.getModelo());
    System.out.println(carro1.getCor());
    System.out.println(carro1.getTanqueGasolina());
    System.out.println(carro1.totalValorTanque(0));

    Carro carro2 = new Carro("cinza", "Mercedes-Benz Classe C", 66);
    
    System.out.println(carro2.getModelo());
    System.out.println(carro2.getCor());
    System.out.println(carro2.getTanqueGasolina());
    System.out.println(carro2.totalValorTanque(6.46));
  } 
}
