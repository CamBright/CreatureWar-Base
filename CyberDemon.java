import java.util.Random;
/**
 * The attributes such as the health, name, and damage of a cyber demon.
 *
 * @author Cameron Brightwell
 * @version 2017
 */
public class CyberDemon extends Demon
{
    private Random random;
  
  /**
   * Constructor of Creature subclass CyberDemon
   */
  public CyberDemon() {
      this.random = new Random();
      this.hp = random.nextInt(25)+75;
      this.strength = random.nextInt(20)+20;
      this.Name = "CyberDemon";
  }
}
