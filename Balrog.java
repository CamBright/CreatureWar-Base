import java.util.Random;
/**
 * The attributes such as the health, name, and damage of a balrog.
 *
 * @author Cameron Brightwell
 * @version 2017
 */
public class Balrog extends Creature
{
  private Random random;
  
  /**
   * Constructor of Creature subclass Balrog
   */
  public Balrog() {
      this.random = new Random();
      this.hp = random.nextInt(80)+120;
      this.strength = random.nextInt(50)+100;
      this.Name = "Balrog";
  }
  
  /**
   * Generate the damage a balrog inflicts and return it.
   * @return int damage
   */
  public int damage() {
    Random oRand = new Random();
    int damage1 = oRand.nextInt(strength);
    int damage2 = oRand.nextInt(strength);
    
    int damage = damage1 + damage2;
    
    return damage;
  }
}
