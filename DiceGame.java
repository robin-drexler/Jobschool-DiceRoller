package dice;

/**
 *
 * @author robin
 */

import java.util.Scanner;

/**
 * initialize dices.
 * now we've got 3, but it's easy to add more
 * 
 */
public class DiceGame {
    private Dice[] dices = new Dice[]
    {
        new Dice("Dice 1"), 
        new Dice("Dice 2"), 
        new Dice("Dice 3")
    };
    
    private int iAmount;
    
    /**
     * determine how often to roll the dieces and then just do it
     */
    public void rollDices()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's roll!11! How often?");
        this.iAmount = scanner.nextInt();
        
        for(Dice dice : this.dices) {
            dice.roll(this.iAmount);
        }
    }
    
    /**
     * get result of all dices and show them
     */
    public void showResult()
    {
        int i;
        int[] iDiceRolls;
        float fPercentage;
        
        for(Dice dice : this.dices) {
            System.out.println("");
            iDiceRolls = dice.evaluateRolls();
            System.out.println(dice.getName());
            
            for(i = 0; i < iDiceRolls.length; i++) {
                //Yeah it's ugly but it works :)
                if(i == 0) {
                    continue;
                }
                //get some statistics candy and calculate percentage
                fPercentage = 100 * iDiceRolls[i] / this.iAmount;
                System.out.println(i + " was rolled >>" + iDiceRolls[i] + "<< times, that equals >>" + fPercentage + "<< %");
            }
        }
    }
}
