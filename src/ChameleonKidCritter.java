                                       
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Furlong
 */
public class ChameleonKidCritter extends ChameleonCritter 
{
    
    @Override
    public void processActors(ArrayList<Actor> actors)
    {
        int n = actors.size();
        if (n == 0)
        {
            setColor(getColor().darker());
            return;
        }
        int r = (int) (Math.random() * n);

        Actor other = actors.get(r);
        setColor(other.getColor());
    }

    @Override
    public ArrayList<Actor> getActors() 
    {
        ArrayList<Actor> returnList = new ArrayList<>();
        Location current = getLocation();
        Location front = current.getAdjacentLocation(getDirection());
        Location behind = current.getAdjacentLocation(getDirection() + Location.HALF_CIRCLE);
        
        returnList.add(getGrid().get(front));
        returnList.add(getGrid().get(behind));
        
        return returnList;
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