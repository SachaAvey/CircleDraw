import java.awt.*;
public class Rect extends shape{
    private int width;
    private int height;

    public Rect(Point initPos,Color col, int win, int hin){ // The constructor
        super(initPos, col); // The constructor
        width=win;
        height=hin;
    }
    public void draw(Graphics g) { // A method that draws the object in g

        g.fillRect(pos.x,pos.y,width,height);
    }
}
