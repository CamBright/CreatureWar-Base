import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    private Army Army;
    private Scanner oScan;
    public Battle() {
        this.Army = new Army();
        oScan = new Scanner(System.in);
    }
    
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
        String Enter = oScan.nextLine();
        System.out.println("The " + Soldier1.getName() + " has " + Soldier1.getHealth() + " health.");
        System.out.println("The " + Soldier2.getName() + " has " + Soldier2.getHealth() + " health.");
        if(Soldier1.damage() > Soldier2.damage()) {
            int newHP = (Soldier2.getHealth() - Soldier1.damage());
            Soldier2.setHP(newHP);
            System.out.println("The " + Soldier1.getName() + " did " + Soldier1.damage() + " damage to " + Soldier2.getName() + ".");
            System.out.println("The " + Soldier2.getName() + " has " + Soldier2.getHealth() + " Health." );
        } else if(Soldier1.damage() > Soldier2.damage()) {
            int newHP = (Soldier1.getHealth() - Soldier2.damage());
            Soldier1.setHP(newHP);
            System.out.println("The " + Soldier2.getName() + " did " + Soldier2.damage() + " damage to " + Soldier1.getName() + ".");
            System.out.println("The " + Soldier1.getName() + " has " + Soldier1.getHealth() + " Health." );
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
  
  private void printWelcome() {
      System.out.println("Welcome to the creature War.");
      System.out.println("Press Enter to start the first battle");
      String Enter = oScan.nextLine();
    }
}
