import java.awt.*;
public class Rect{
    private int width;
    private int height;
    private Point pos;
    private Color col;

    public Rect(Point initPos,Color colin, int win, int hin){ // The constructor
        pos=initPos;
        col=colin;
        width=win;
        height=hin;
    }
    public void draw(Graphics g) { // A method that draws the object in g

        g.fillRect(pos.x,pos.y,width,height);
    }
}
