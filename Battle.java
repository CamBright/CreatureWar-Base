import java.util.ArrayList;
import java.util.Scanner;
/**
 * Take two creatures from each army list and have them battle. Let the user
 * know who won the battle, how much damage was dealt, and the health of the 
 * creatures before and after battle.
 * If the creatures die, let the user know they died and take them out of the
 * army list
 * Once an army is defeated, let the user know the winning army and end the 
 * game.
 *
 * @author Cameron Brightwell
 * @version 2017
 */
public class Battle
{
    private Army Army;
    private Scanner oScan;
    
    /**
     * Constructor for Battle class.
     */
    public Battle() {
        this.Army = new Army();
        oScan = new Scanner(System.in);
  }
    
  /**
   * Have two armies fight to the death, one creature at a time. Let the user 
   * know the outcome of each battle and the winner of the war.
   */
    public void War() {
        printWelcome();
        ArrayList<Creature> Army1 = Army.getArmy1();
        ArrayList<Creature> Army2 = Army.getArmy2();
      for(int i = 0; Army1.size() != 0 || Army2.size() != 0; i++) {
          if(i >= Army2.size() || i >= Army1.size()) {
              i = 0;
            }
        Creature Soldier1 = Army1.get(i);
        Creature Soldier2 = Army2.get(i);
        System.out.println("This battle is between a " + Soldier1.getName() + " and a " + Soldier2.getName());
        System.out.println("Press enter to have them battle.");
        String Enter = oScan.nextLine();
        System.out.println("The " + Soldier1.getName() + " has " + Soldier1.getHealth() + " health.");
        System.out.println("The " + Soldier2.getName() + " has " + Soldier2.getHealth() + " health.");
        int Soldier1Damage = Soldier1.damage();
        int Soldier2Damage = Soldier2.damage();
        int Soldier1HP = Soldier1.getHealth();
        int Soldier2HP = Soldier2.getHealth();
        if(Soldier1Damage > Soldier2Damage) {
            int newHP = (Soldier2HP - Soldier1Damage);
            Soldier2.setHP(newHP);
            Soldier2HP = Soldier2.getHealth();
            System.out.println("The " + Soldier1.getName() + " did " + Soldier1Damage + " damage to " + Soldier2.getName() + ".");
            System.out.println("The " + Soldier2.getName() + " has " + Soldier2HP + " Health." );
        } else if(Soldier1Damage < Soldier2Damage) {
            int newHP = (Soldier1HP - Soldier2Damage);
            Soldier1.setHP(newHP);
            Soldier1HP = Soldier1.getHealth();
            System.out.println("The " + Soldier2.getName() + " did " + Soldier2Damage + " damage to " + Soldier1.getName() + ".");
            System.out.println("The " + Soldier1.getName() + " has " + Soldier1HP + " Health." );
        } else  {
            System.out.println("They blocked eachothers attacks, no damage taken.");
       }
       if(Soldier1.isAlive() == false) {
           System.out.println("The " + Soldier1.getName() + " is dead.");
           System.out.println("The battle has ended.");
           Army1.remove(i);
        } else if (Soldier2.isAlive() == false) {
           System.out.println("The " + Soldier2.getName() + " is dead.");
           System.out.println("The battle has ended.");
           Army2.remove(i);
        } 
       if(Army2.size() == 0 || Army1.size() == 0) {
           break;
        }
    }
    if(Army1.size() == 0) {
        System.out.println("The war ends. Army2 has won whith " + Army2.size() + " Creatures left.");
    } else {
        System.out.println("The war ends. Army1 has won with " + Army1.size() + " Creatures left.");
    }
  }
  
  /**
   * Welcome the user and explain the Program.
   */
  private void printWelcome() {
      System.out.println("Welcome to the creature War.");
      System.out.println("This war is between good(army 1) and evil (army 2)");
      System.out.println("There are 20 Creatures in each army, and they are prepared for battle!!");
      System.out.println("Press Enter to start the first battle");
      String Enter = oScan.nextLine();
    }
}
