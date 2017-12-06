import java.util.Random;
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private Random random;
  
  public Elf() {
      this.random = new Random();
      this.hp = random.nextInt(8)+17;
      this.strength = random.nextInt(5)+13;
      this.Name = "Elf";
  }
  
  public int damage() {
      Random oRand = new Random();
      int damage = oRand.nextInt(strength);
      int MagicChance = oRand.nextInt(49) + 1;
      if(MagicChance >= 1 && MagicChance <= 5) {
            damage = (damage*2);
      }
        
      return damage;
    }
}
