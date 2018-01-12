
import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
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
public class JumperBug extends Bug
{
    @Override
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location adj = loc.getAdjacentLocation(getDirection());
        Location next = adj.getAdjacentLocation(getDirection());
        
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
    
    @Override
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location adj = loc.getAdjacentLocation(getDirection());
        Location next = adj.getAdjacentLocation(getDirection());
        
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }

    
}
