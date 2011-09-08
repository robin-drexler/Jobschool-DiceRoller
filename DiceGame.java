/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author robin
 */

import java.util.Scanner;

public class DiceGame {
    private Dice[] dices = new Dice[]
    {
        new Dice("Dice 1"), 
        new Dice("Dice 2"), 
        new Dice("Dice 3")
    };
    
    public void rollDices()
    {
        int iAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's roll!11! How often?");
        iAmount = scanner.nextInt();
        
        for(Dice dice : this.dices) {
            dice.roll(iAmount);
        }
    }
    
    public void showResult()
    {
        int i;
        int[] iDiceRolls;
        
        for(Dice dice : this.dices) {
            System.out.println("");
            iDiceRolls = dice.evaluateRolls();
            System.out.println(dice.getName());
            
            for(i = 0; i < iDiceRolls.length; i++) {
                //Yeah it's ugly but it works :)
                if(i == 0) {
                    continue;
                }
                
                System.out.println(i + " was rolled >>" + iDiceRolls[i] + "<< times");
            }
            
        }
    }
}
