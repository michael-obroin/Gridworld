/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ob.gridworld;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.Actor;  

/**
 *
 * @author sicp
 */
public class CircleBugRunner 
{
    public static void main(String[] args)
    {
        //code for unbounded grid
        UnboundedGrid grid = new UnboundedGrid<Actor>();          
        ActorWorld world = new ActorWorld(grid);
        
        CircleBug alice = new CircleBug(3);
        alice.setColor(Color.YELLOW);
        CircleBug bob = new CircleBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        
        world.show();
    }
    
}
