
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
        
        Location currentLoc = getLocation();
        
        for (int i = -2; i < 3; i++) 
        {
            int col = currentLoc.getCol();
            int row = currentLoc.getRow();
            
            Location parsingLoc = new Location(row, col);
            Actor parsedActor = getGrid().get(parsingLoc);
            
            if( (parsedActor instanceof ChameleonCritter) || (parsedActor instanceof ChameleonKidCritter) 
               || (parsedActor instanceof CrabCritter) || (parsedActor instanceof RockHoundCritter) 
               || (parsedActor instanceof BlusterCritter))
            {
                returnList.add(parsedActor);
            }   
            
        }
        
        return returnList;
    }

    @Override
    public void processActors(ArrayList<Actor> actors) 
    {
        int size = getActors().size();
        
        if(size >= COURAGEVAL)
            colorChange(-0.05);
        else if(size < COURAGEVAL)
            colorChange(0.05);
    }
    
    public void colorChange(double in)
    {
        final double CHANGE_FACTOR = in;
        Color c = getColor();
        int red = (int) (c.getRed() * (1 + CHANGE_FACTOR));
        int green = (int) (c.getGreen() * (1 + CHANGE_FACTOR));
        int blue = (int) (c.getBlue() * (1 + CHANGE_FACTOR));

        setColor(new Color(red, green, blue));
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
