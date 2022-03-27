package ModeBehavior;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawUseCase extends JComponent
{
    private int x = 0;
    private int y = 0;

    public DrawUseCase(){}
    public DrawUseCase(int _x, int _y){
        setX(_x - 60);
        setY(_y - 40);
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

//        this.setOpaque(true);
//        this.setBackground(Color.white);
        this.setSize(130, 90);

        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(new Ellipse2D.Double(5, 5, 120, 80));


    }

}
