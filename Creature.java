import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   protected int hp;
   protected int strength;
   protected String Name;
    
    public Creature() {
        this.strength = 10;
        this.hp = 10;
        this.Name = "";
    }
   public int damage() {
       Random oRand = new Random();
       int damage = oRand.nextInt(strength);
       return damage;
    }
    
    public boolean isAlive() {
        boolean Alive = true;
        if(hp <= 0) {
            Alive = false;
        } else {
            Alive = true;
        }
        return Alive;
    }
    
    public void setHP(int newHP) {
       hp = newHP;
    }
    
    public int getHealth() {
        return hp;
    }
    
    public String getName() {
        return Name;
    }
    
}
