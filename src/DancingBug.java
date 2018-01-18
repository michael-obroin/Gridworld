
import info.gridworld.actor.Bug;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furlong
 */
public class DancingBug extends Bug 
{
    private int currentIndex = 0;
    //private int steps = 3;
    private final int[] danceArray;
    
    public DancingBug(int[] inputArray) 
    {
        danceArray = inputArray;
    }

    @Override
    public void act() 
    {
        int numTurns = danceArray[currentIndex];
        
        
            for (int i = 0; i < numTurns; i++) 
            {
                turn();
            }
        
            if(canMove()) move();
        
            currentIndex++;
            if (currentIndex >= danceArray.length)
            {
                currentIndex = 0;
            }
        
    }
        
    
    
}
