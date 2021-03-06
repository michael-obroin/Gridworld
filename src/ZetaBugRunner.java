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
 * @author sicp
 */
public class ZetaBugRunner 
{
    public static void main(String[] args)
    {
        //code for unbounded grid
        UnboundedGrid grid = new UnboundedGrid<>();          
        ActorWorld world = new ActorWorld(grid);
        
        ZetaBug alice = new ZetaBug(4);
        alice.setColor(Color.YELLOW);
        world.add(new Location(7, 8), alice);
        
        world.show();
    }
    
}
