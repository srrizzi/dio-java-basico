import java.nio.channels.Pipe;

import javax.xml.crypto.KeySelector.Purpose;

public class SmartTv
{
  boolean online = false;
  int channel = 1;
  int volume = 25;

  // Ligando a TV
  public void on()
  {
    online = true;
  }
  
  //Desligando a TV
  public void off()
  {
    online = false;
  }

  // Aumentando o volume da TV
  public void moreVolume()
  {
    volume++;
  }

  //Diminuindo o volume da TV
  public void lessVolume()
  {
    volume--;
  }

  // Aumentando o Canal
  public void moreChannel()
  {
    channel++;
  }

  //Diminuindo o Canal
  public void lessChannel()
  {
    channel--;
  }

  //Canal Atual
  public void currentChannel(int newChannel)
  {
    channel = newChannel;
  }
}
