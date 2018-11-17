import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Square and extends Rectangle.
 * 
 * @author Gabe Scott
 * @version 2018-11-17
 * Lab 12
 */
public class Square extends Rectangle
{

    /**
     * Constructor for a Rectangle with equal length and widths
     * 
     * @param center Center point of the square
     * @param width Width (and height) of the square
     * @param color Desired color for the square
     * @param filled True if the square should be filled solid
     */
    public Square(Point center, int width, Color color, boolean filled)
    {
        // TODO: implement this.
        super(center, width, width, color, filled);
        
        
    }
}
