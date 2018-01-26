
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
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
public class KingCrabRunner 
{
    public static void main(String[] args) 
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4,8), new Rock());
        world.add(new Location(5, 8), new KingCrab());
        world.show();
    }
}
