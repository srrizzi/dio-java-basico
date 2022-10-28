public class Carro extends Veiculo
{
  String cor, modelo;
  int tanqueGasolina;

  Carro()
  {

  }

  Carro(String cor, String modelo, int tanqueGasolina)
  {
    this.cor = cor;
    this.modelo = modelo;
    this.tanqueGasolina = tanqueGasolina;
  }

  void setCor(String cor)
  {
    this.cor = cor;
  }

  String getCor()
  {
    return cor;
  }

  void setModelo(String modelo)
  {
    this.modelo = modelo;
  }

  String getModelo()
  {
    return modelo;
  }

  void setTanqueGasolina(int tanqueGasolina)
  {
    this.tanqueGasolina = tanqueGasolina;
  }

  int getTanqueGasolina()
  {
    return tanqueGasolina;
  }

  double totalValorTanque(double ValorCombustivel)
  {
    return tanqueGasolina + ValorCombustivel;
  }



}
