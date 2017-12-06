import java.util.Random;
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    private Random random;
  
    public Human() {
      this.random = new Random();
      this.hp = random.nextInt(20)+10;
      this.strength = random.nextInt(5)+13;
      this.Name = "Human";
    }
}
