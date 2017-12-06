import java.util.Random;
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    
    public Demon() {
        this.Name = "Demon";
    }
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
