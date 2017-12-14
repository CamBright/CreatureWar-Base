import java.util.Random;
/**
 * The attributes such as the health, name, and damage of an elf.
 *
 * @author Cameron Brightwell
 * @version 2017
 */
public class Elf extends Creature
{
    private Random random;
  
  /**
   * Constructor of Creature subclass Elf
   */
  public Elf() {
      this.random = new Random();
      this.hp = random.nextInt(8)+17;
      this.strength = random.nextInt(5)+13;
      this.Name = "Elf";
  }
  
  /**
   * Generate the damage an elf inflicts and return it.
   * @return int damage
   */
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
