
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
            final double DARKENING_FACTOR = 0.05;
            Color c = getColor();
            int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
            int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
            int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));
        
            setColor(new Color(red, green, blue));
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

}