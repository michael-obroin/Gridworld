
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sicp
 */
public class QuickCrabCritter extends CrabCritter
{
    
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location adj;
        Location next = null;
        
        boolean bothEmpty = false;
        ArrayList occupied = getGrid().getOccupiedLocations();
        
        double r = (Math.random());
        if( r > .5 )
        {
            adj = loc.getAdjacentLocation(getDirection() + Location.RIGHT);
            next = adj.getAdjacentLocation(getDirection());
            
            if( !occupied.contains(adj) && !occupied.contains(next))
            {
                bothEmpty = true;
            }
        } else 
        {
            adj = loc.getAdjacentLocation(getDirection() + Location.LEFT);
            next = adj.getAdjacentLocation(getDirection());
            
            if( !occupied.contains(adj) && !occupied.contains(next))
            {
                bothEmpty = true;
            }
        }
        
        if (gr.isValid(next) && bothEmpty)
        {
            moveTo(next);
        }
        else
        {
           System.out.println("Survival of the fittest");
            removeSelfFromGrid(); 
        }
        
    }
    
}
