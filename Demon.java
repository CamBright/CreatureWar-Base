import java.util.Random;
/**
 * The attributes such as the health, name, and damage of a demon.
 *
 * @author Cameron Brightwell
 * @version 2017
 */
public class Demon extends Creature
{
    /**
   * Constructor of Creature subclass Demon
   */
   public Demon() {
        this.Name = "Demon";
   }
   
   /**
   * Generate the damage an elf inflicts and return it.
   * @return int damage
   */
   public int damage() {
        Random oRand = new Random();
        int damage = oRand.nextInt(strength);
        int MagicChance = oRand.nextInt(99) + 1;
        if(MagicChance >= 1 && MagicChance <= 5) {
            damage += 50;
        }
        
        return damage;
   }
}
