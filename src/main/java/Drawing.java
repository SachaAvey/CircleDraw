import java.util.ArrayList; // import the ArrayList class
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import shapes.shape;
import shapes.square;
import shapes.circle;
import shapes.rect;



public class Drawing extends Canvas{
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private circle circ;
    private rect rect;
    private square sqr;
    private ArrayList<shape> shapes;


    // The constructor
    public Drawing() {
        Point p=new Point(200,200);
        Color c=new Color(0x992266);
        circ= new circle(p, c, 50);
        rect= new rect(p,c,50,10);
        shapes= new ArrayList<shape>();
        shapes.add(new circle(p, c, 30));
        shapes.add(new rect(p,c,80,10));
        setupFrame();
        setBackground();

    }

    private void setBackground() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){
        //circ.shapes.draw(g);
        //rect.shapes.draw(g);
        for (int i=0; i<shapes.size(); i++){
            shapes.get(i).draw(g);
        }
    }
}