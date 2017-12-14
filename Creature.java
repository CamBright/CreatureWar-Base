import java.util.Random;
/**
 * Creature superclass with the basic building blocks of a crature object.
 * 
 * @author Cameron Brightwell
 * @version 2017
 */
public class Creature
{
   protected int hp;
   protected int strength;
   protected String Name;
    
   /**
    * Creature class Constructor
    */
    public Creature() {
        this.strength = 10;
        this.hp = 10;
        this.Name = "";
    }
    
    /**
     * Generate a random amount of damage dealt by the creature.
     * @return int damage
     */
   public int damage() {
       Random oRand = new Random();
       int damage = oRand.nextInt(strength);
       return damage;
    }
    
    /**
     * Check and see if the creature is alive.
     * @return a boolean stating whether or not the creature is alive.
     */
   public boolean isAlive() {
        boolean Alive = true;
        if(hp <= 0) {
            Alive = false;
        } else {
            Alive = true;
        }
        return Alive;
   }
    
   /**
    * set hp to newHP.
    * @param int newHP.
    */
   public void setHP(int newHP) {
       hp = newHP;
   }
    
   /**
    * Return the amount of health the creature currently has.
    * @return int hp
    */
   public int getHealth() {
        return hp;
   }
    
   /**
    * Return the Name of the creature.
    * @return String Name.
    */
   public String getName() {
        return Name;
   }
    
}
