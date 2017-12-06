import java.util.Random;
/**
 * Write a description of class Cyberdemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private Random random;
  
  public CyberDemon() {
      this.random = new Random();
      this.hp = random.nextInt(25)+75;
      this.strength = random.nextInt(20)+20;
      this.Name = "CyberDemon";
  }
}
