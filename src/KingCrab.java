
import info.gridworld.actor.Actor;
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
public class KingCrab extends CrabCritter
{
    //move ***** get out the way get out the way ***** get out the way
    @Override
    public void processActors(ArrayList<Actor> actors) 
    {
        for (int i = 0; i < actors.size(); i++) 
        {
            Actor kevin = actors.get(i);
            int immediateDir = getLocation().getDirectionToward(kevin.getLocation());
            Location moveLocation = kevin.getLocation().getAdjacentLocation(immediateDir);
            
            boolean canMove = getGrid().isValid(moveLocation);
            
            if(canMove)
            {
                kevin.moveTo(moveLocation);
            }else 
                kevin.removeSelfFromGrid();
            
        }
        
    }
    
}
