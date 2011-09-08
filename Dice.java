/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author robin
 */
public class Dice {

    private int[] rolls = new int[7];
    private String name;
    
    public Dice(String name)
    {
        this.name = name;
    }
    
    public int getRandomNumberInRange(int lowerRange, int upperRange) 
    {
        double randomNumber = (Math.random() * (upperRange - lowerRange + 1) + lowerRange);
        return (int) randomNumber;
    }
    
    public String getName()
    {
        return this.name;
    }

    public void roll(int iAmount) 
    {
        int i;
        
        for(i = 0; i < iAmount; i++) {
            this.rolls[this.getRandomNumberInRange(1, 6)]++;
        }
        
    }
    
    public int[] evaluateRolls() 
    {
        return this.rolls;
    }
}