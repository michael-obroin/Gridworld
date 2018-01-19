
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sicp
 */
public class BlusterCritter extends Critter
{
    private final int COURAGEVAL;
    
    public BlusterCritter(int inputCourage)
    {
        COURAGEVAL = inputCourage;
    }

    @Override
    public ArrayList<Actor> getActors() 
    {
        ArrayList<Actor> returnList = new ArrayList<>();
        ArrayList<Actor> immediateNeighbors = getGrid().getNeighbors(getLocation());
        
        
        for (Actor immediateNeighbor : immediateNeighbors) 
        {
            for (Object object : getGrid().getNeighbors(immediateNeighbor.getLocation())) 
            {
                
            }
            returnList.add(immediateNeighbor);
            
        }
        
        return returnList;
    }

    
    
}
