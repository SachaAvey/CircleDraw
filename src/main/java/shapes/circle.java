package shapes;
import java.awt.*;
/**
 * The shapes.Circle class encapsulates the information describing a circle and can shapes.draw it in
 * an AWT Graphics object using AWT library methods
 * */
public class circle extends shape {
    private int rad; // Fields

    public circle(Point initPos, Color col, int radius){
        super(initPos, col); // The constructor
        rad=radius; // Initialize fields
    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }
}