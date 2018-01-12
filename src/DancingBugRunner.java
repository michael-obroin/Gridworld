
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furlong
 */
public class DancingBugRunner 
{
    
    
    public static void main(String[] args)
    {
        //code for unbounded grid
        UnboundedGrid grid = new UnboundedGrid<Actor>();          
        ActorWorld world = new ActorWorld(grid);
        
        int[] array1 = {5, 4, 3, 4};
        DancingBug alice = new DancingBug(array1);
        alice.setColor(Color.BLUE);
        world.add(new Location(7, 8), alice);
        
        world.show();
    }
}
