import java.util.Random;
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Creature
{
    // instance variables - replace the example below with your own
  private Random random;
  
  public Balrog() {
      this.random = new Random();
      this.hp = random.nextInt(80)+120;
      this.strength = random.nextInt(50)+100;
      this.Name = "Balrog";
  }
  
  public int damage() {
    Random oRand = new Random();
    int damage1 = oRand.nextInt(strength);
    int damage2 = oRand.nextInt(strength);
    
    int damage = damage1 + damage2;
    
    return damage;
  }
}
