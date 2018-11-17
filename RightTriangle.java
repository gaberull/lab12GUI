import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Right Triangle and extends Polygon.
 * 
 * @author Gabe Scott
 * @version 2018-11-17
 * Lab 12
 */
public class RightTriangle extends Polygon
{

    /**
     * Triangle constructor.
     * 
     * @param pointRightAngle The vertex of the right triangle that has the right angle.
     * @param base The width of the base.  Positive widths correspond to 2nd vertex being to the right
     *               of this vertex; negative widths correspond to the 2nd vertex being to the left.
     * @param height The height at the apex of the triangle.  Positive heights correspond to the vertex 
     *               being placed below the base; negative heights correspond to the vertex being
     *               placed above the base.
     * @param color Desired color of the triangle.
     * @param filled Whether or not the triangle should be filled.
     */
    public RightTriangle(Point pointRightAngle, int base, int height, Color color, boolean filled)
    {
        // TODO: implement this
        super(color, filled);
        
        location = new Point[3];
        location[0] = new Point(pointRightAngle.x, pointRightAngle.y);
        
        if (base > 0)
        {
            location[1] = new Point(pointRightAngle.x - base, pointRightAngle.y);
        }
        else if (base < 0)
        {
            location[1] = new Point(pointRightAngle.x - base, pointRightAngle.y);
        }
        
        if (height > 0)
        {
            location[2] = new Point(pointRightAngle.x, pointRightAngle.y - height);
        }
        else if (height < 0)
        {
            location[2] = new Point(pointRightAngle.x, pointRightAngle.y + height);
        }
        
    }
}
