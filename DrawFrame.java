
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Gabe Scott
 * @version 2018-11-17
 * Lab 12
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.ORANGE, true);
        
        // Ears:
        RightTriangle outEarLeft = new RightTriangle(new Point(280,150), 40, -100, Color.GRAY, true);
        RightTriangle inEarLeft = new RightTriangle(new Point(285,145), 30, -78, Color.PINK, true);
        
        RightTriangle outEarRight = new RightTriangle(new Point(530,150), -40, -100, Color.GRAY, true);
        RightTriangle inEarRight = new RightTriangle(new Point(525,145), -30, -78, Color.PINK, true);
        
        // Eyes:
        Oval outEyeLeft = new Oval(new Point(330, 210), 45, 77, Color.WHITE, true);
        Oval inEyeLeft = new Oval(new Point(330, 210), 33, 60, Color.BLACK, true);
        
        Oval outEyeRight = new Oval(new Point(470, 210), 45, 77, Color.WHITE, true);
        Oval inEyeRight = new Oval(new Point(470, 210), 33, 60, Color.BLACK, true);
        
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400,300), 35, Color.BLUE, true);
        PolyLine leftWhisker = new PolyLine(new Point(330, 375), new Point(400, 400), 45, Color.BLACK, true);
        //PolyLine rightWhisker = new PolyLine(new Point(470, 375))
        
        // Collar:
        
        
        // Square around the dog:
        
        
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(outEarLeft);
        drawPanel.addShape(outEarRight);
        drawPanel.addShape(inEarLeft);
        drawPanel.addShape(inEarRight);
        drawPanel.addShape(outEyeLeft);
        drawPanel.addShape(inEyeLeft);
        drawPanel.addShape(outEyeRight);
        drawPanel.addShape(inEyeRight);
        drawPanel.addShape(nose);
        drawPanel.addShape(leftWhisker);
        
        
        

        
        // set background color
        drawPanel.setBackground(Color.YELLOW);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
