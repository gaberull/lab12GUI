
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Gabe Scott
 * @version 2018-11-17
 * Lab 12
 */
public class RightTriangleTestOfficial
{

    private static RightTriangle s1 = new RightTriangle(new Point(100, 100), 150, 150, Color.BLUE, true);
    private static Point s1Center = new Point(100, 100);
    private static Point s1upY = new Point(-50, 100);
    private static Point s1leftX = new Point(100, -50);

    private static RightTriangle s2 = new RightTriangle(new Point(150, 150), 200, 200, Color.ORANGE, false);
    private static Point s2Center = new Point(150, 150);
    private static Point s2upY = new Point(-50, 150);
    private static Point s2leftX = new Point(150, -50);

    @Test
    public void testRightTriangleConstructorPointsArrayLength()
    {
        Point[] pts = s1.getLocation();
        Assert.assertEquals(3, pts.length);
    }

    /**
     * Check points
     */
    @Test
    public void testRightTriangleConstructorCalculatedPoints()
    {
        Point[] pts1 = s1.getLocation();
        Assert.assertTrue("Expected point not appearing in Right Triangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1Center));
        Assert.assertTrue("Expected point not appearing in  Right Triangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1upY));
        Assert.assertTrue("Expected point not appearing in  Right Triangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1leftX));

        Point[] pts2 = s2.getLocation();
        Assert.assertTrue("Expected point not appearing in  Right Triangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2Center));
        Assert.assertTrue("Expected point not appearing in  Right Triangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2upY));
        Assert.assertTrue("Expected point not appearing in  Right Triangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2leftX));

    }

    /**
     * Unfilled case
     */
    @Test
    public void testRightTriangleConstructorUnfilled()
    {
        Assert.assertFalse(" Right Triangle fill incorrect.", s2.isFilled());
    }

    /**
     * Filled case
     */
    @Test
    public void testRightTriangleConstructorFilled()
    {
        Assert.assertTrue(" Right Triangle fill incorrect.", s1.isFilled());
    }

    /**
     * Color
     */
    @Test
    public void testRightTriangleConstructorColor()
    {
        Color color1 = s1.getColor();
        Color color2 = s2.getColor();
        Assert.assertEquals(" Right Triangle color incorrect.", Color.BLUE, color1);
        Assert.assertEquals(" Right Triangle color incorrect.", Color.ORANGE, color2);
    }
}
