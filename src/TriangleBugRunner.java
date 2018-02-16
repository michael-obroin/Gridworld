
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
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
public class TriangleBugRunner 
{
    public static void main(String[] args) 
    {
        ActorWorld world = new ActorWorld();
        world.add(new Rock());
        world.add(new Flower(Color.BLUE));
        world.add(new TriangleBug(3));
        
        world.show();
    }
}
