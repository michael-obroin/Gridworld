/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 *
 * @author sicp
 */
public class ZetaBug extends Bug
{
    
    private int steps;
    private int sideLength;
    private int turnNumber = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZetaBug(int length)
    {
        steps = 0;
        sideLength = length;
        
        setDirection(Location.EAST);
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }else if (turnNumber == 0 && canMove())
        {
            setDirection(Location.SOUTHWEST);
            steps = 0;
            turnNumber = 1;
        } else if (turnNumber == 1 && canMove())
        {
            setDirection(Location.EAST);
            steps = 0;
            turnNumber = 2;
        } else if (turnNumber == 2)
        {
            
        }
        
    }
    
}
