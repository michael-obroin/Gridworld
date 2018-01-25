
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
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
        Actor parsedActor = null;
        Location currentLoc = getLocation();
        
        for (int i = -2; i < 3; i++) 
        {
            int col = currentLoc.getCol() + i;
            int row = 0;
            
            for (int j = -2; j < 3; j++) 
            {
                row = currentLoc.getRow() + j;
            }
            
            Location parsingLoc = new Location(row, col);
            if(getGrid().isValid(parsingLoc))
                parsedActor = getGrid().get(parsingLoc);
            
            if( (parsedActor instanceof ChameleonCritter) || (parsedActor instanceof ChameleonKidCritter) 
               || (parsedActor instanceof CrabCritter) || (parsedActor instanceof RockHoundCritter) 
               || (parsedActor instanceof BlusterCritter))
            {
                if(!parsedActor.equals(this))
                    returnList.add(parsedActor);
            }   
            
        }
        
        return returnList;
    }

    @Override
    public void processActors(ArrayList<Actor> actors) 
    {
        int size = getActors().size();
        Color c = getColor();
        
        if(size >= COURAGEVAL)
            setColor(c.darker());
        else if(size < COURAGEVAL)
            setColor(c.brighter());
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
