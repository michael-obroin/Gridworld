/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ob.gridworld;

import info.gridworld.actor.Bug;

/**
 *
 * @author sicp
 */
public class ZetaBug extends Bug
{
    
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZetaBug(int length)
    {
        steps = 0;
        sideLength = length;
        
        setDirection(1);
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
        }
        else
        {
            turn();
            //turn();
            steps = 0;
            sideLength++;
        }
    }
    
}
