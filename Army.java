import java.util.ArrayList;
import java.util.Random;
/**
 * This class creates 2 Armies filled with different types of random creatures.
 *
 * @author Cameron Brightwell
 * @version 2017
 */
public class Army
{
    // instance variables 
    private ArrayList<Creature> Army1;
    private ArrayList<Creature> Army2; 
    
    /**
     * Constructor of Army class
     */
    public Army() {
        this.Army1 = new ArrayList<>();
        this.Army2 = new ArrayList<>();
        this.Army1 = ArmyCreator(1);
        this.Army2 = ArmyCreator(2);
    }
    
    /**
     * Takes in the army type and fills the array list depending on it, then 
     * returns the array list filled with creatures.
     * @param int ArmyType
     * @return ArralList Army.
     */
    public ArrayList ArmyCreator(int ArmyType) {
        Random oRand = new Random();
        ArrayList<Creature> Army = new ArrayList<>();
        for(int i = 1; i < 20; i++) {
            Creature Human = new Human(), Elf = new Elf(), 
            Demon = new Demon(), Balrog = new Balrog(),
            CyberDemon = new CyberDemon();
            int CreatureType = oRand.nextInt(9) + 1;
            if(ArmyType == 1) {
                if(CreatureType >= 1 && CreatureType <= 6) {
                    Army.add(Human);
                } else if(CreatureType >= 7 && CreatureType <= 10) {
                    Army.add(Elf);
                }
            } else if(ArmyType == 2) {
                if(CreatureType >= 1 && CreatureType <= 7) {
                    Army.add(Demon);
                } else if(CreatureType == 8 || CreatureType == 9) {
                    Army.add(CyberDemon);
                } else if(CreatureType == 10) {
                    Army.add(Balrog);
                }
            }
        }
        
        return Army;
    }
        
    /**
     * Return the Army full of good creatures.
     * @return ArrayList Army1.
     */
    public ArrayList getArmy1() {
            return Army1;
    }
    
    /**
     * Return the army full of evil creatures.
     * @return ArrayList Army2.
     */
    public ArrayList getArmy2() {
            return Army2;
    }
    }
    

