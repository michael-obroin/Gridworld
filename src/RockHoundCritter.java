
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furlong
 */
public class RockHoundCritter extends Critter
{
    @Override
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if ((a instanceof Rock))
                a.removeSelfFromGrid();
        }
    }
    
    /**
     * Turns towards the new location as it moves.
     * @param loc
     */
    @Override
    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}
