package shapes;
import java.awt.*;
public abstract class shape implements draw{
    protected Point pos;
    protected Color col;
    //public abstract void shapes.draw(Graphics g);

    public shape(Point initPos, Color col) {
        pos = initPos;
        this.col = col;
    }
}
