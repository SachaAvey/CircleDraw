package shapes;

import java.awt.*;
public class rect extends shape {
    private int width;
    private int height;

    public rect(Point initPos,Color col, int win, int hin){ // The constructor
        super(initPos, col); // The constructor
        width=win;
        height=hin;
    }
    public void draw(Graphics g) { // A method that draws the object in g

        g.fillRect(pos.x,pos.y,width,height);
    }
}
