
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sicp
 */
public class TriangleBug extends Bug
{

    private int steps;
    private int sideLength;
    private int sideNum = 0;
    private int iterNum = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public TriangleBug(int length)
    {
        steps = 0;
        sideLength = length;
        setDirection(Location.NORTHEAST);
    }

    /**
     * Moves to the next location of the square.
     */
    @Override
    public void act()
    {
        
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else if(sideNum == 0 && canMove())
        {
            if(iterNum == 0)
            {
                sideLength += 1;
            } else
            {
                sideLength -= 1;
            }
            setDirection(Location.SOUTH);
            steps = 0;
            sideNum = 1;
        } else if(sideNum == 1 && canMove())
        {
            if(iterNum == 0)
            {
                sideLength += 1;
            } else
            {
                sideLength -= 1;
            }
            setDirection(Location.WEST);
            steps = 0;
            sideNum = 2;
        } else if(sideNum == 2)
        {
            setDirection(Location.NORTHEAST);
            if(iterNum == 0)
            {
                iterNum = 1;
            } else
            {
                iterNum = 0;
            }
            steps = 0;
            sideNum = 0;
            
        } else
            turn();
    }
}

