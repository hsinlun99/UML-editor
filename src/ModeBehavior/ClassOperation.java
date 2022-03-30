package ModeBehavior;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class ClassOperation extends JComponent {


    private int x = 0;
    private int y = 0;

    public ClassOperation(int _x, int _y){
//        this.setSize(102, 153);
        setX(_x - 50);
        setY(_y - 76);
    }

    public void setX(int _x){
        this.x = _x;
    }
    public int getX(){
        return this.x;
    }

    public void setY(int _y){
        this.y = _y;
    }
    public int getY(){
        return this.y;
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D

        JLabel label = new JLabel("New Class");

        this.add(label);
        this.setSize(102, 153);

        g2d.setPaint(Color.black);
        g2d.fill(new Rectangle2D.Double(2, 2, 100, 152));
        g2d.setPaint(Color.white);
        g2d.fill(new Rectangle2D.Double(7, 7, 90, 30));
        g2d.fill(new Rectangle2D.Double(7, 44, 90, 30));// y = previous_y +7+h
        g2d.fill(new Rectangle2D.Double(7, 81, 90, 30));
        g2d.fill(new Rectangle2D.Double(7, 118, 90, 30));

    }
}
