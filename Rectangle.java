import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Rectangle and extends Polygon.
 * 
 * @author Gabe Scott
 * @version 2018-11-17
 * Lab 12
 */
public class Rectangle extends Polygon
{

    /**
     * Constructor for the Rectangle class
     * 
     * @param center Center point of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param color Desired color for the rectangle
     * @param filled Whether or not the rectangle should be filled solid
     */
    public Rectangle(Point center, int width, int height, Color color, boolean filled)
    {
        // TODO: implement this.
        super(color, filled);
        
        location = new Point[4];
        int x1 = center.x - width;
        int y1 = center.y - (height / 2);
        int x2 = center.x + (width / 2);
        int y2 = center.y + (height / 2);
        
        // bottom left
        location[0] = new Point(center.x - width / 2, center.y - height/2);
        //
        location[1] = new Point(center.x + width, center.y - width);
        location[2] = new Point(center.x + width, center.y + width);
        location[3] = new Point(center.x - width, center.y + width);
    }
}