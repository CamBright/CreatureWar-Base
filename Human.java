import java.util.Random;
/**
 * The attributes such as the health, name, and damage of a human
 *
 * @author Cameron Brightwell
 * @version 2017
 */
public class Human extends Creature
{
    private Random random;
  
   /**
    * Constructor of Creature subclass Human
    */
    public Human() {
      this.random = new Random();
      this.hp = random.nextInt(20)+10;
      this.strength = random.nextInt(5)+13;
      this.Name = "Human";
    }
}
