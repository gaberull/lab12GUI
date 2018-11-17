import java.awt.Color;
import java.awt.Point;

/**
 * Lab 12
 * 
 * Class representing a shape.
 * 
 * @author Austin "Gabe" Scott
 * @version 2018-11-17
 */
public abstract class Shape implements Drawable
{
    protected Point[] location;
    private Color color;
    private boolean filled;
    
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public boolean isFilled()
    {
        return this.filled;
    }
    
    public Point[] getLocation()
    {
        return this.location;
    }
}
