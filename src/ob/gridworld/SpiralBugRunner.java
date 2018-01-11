/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ob.gridworld;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;
import java.awt.Color;

/**
 *
 * @author sicp
 */
public class SpiralBugRunner 
{
        public static void main(String[] args)
    {
        //code for unbounded grid
        UnboundedGrid grid = new UnboundedGrid<Actor>();          
        ActorWorld world = new ActorWorld(grid);
        
        SpiralBug alice = new SpiralBug(1);
        alice.setColor(Color.YELLOW);
        world.add(new Location(7, 8), alice);
        
        world.show();
    }
    
}
