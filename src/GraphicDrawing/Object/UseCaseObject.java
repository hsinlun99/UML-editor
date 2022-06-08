package GraphicDrawing.Object;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class UseCaseObject extends BaseObject{
    public static final Point USE_CASE_SIZE = new Point(120, 80);
    public static Point BORDER_SIZE = new Point(5, 5);

    public UseCaseObject(Point _pos){
        super("Use Case", _pos, USE_CASE_SIZE);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D

        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(new Ellipse2D.Double(pos.width + BORDER_SIZE.x/2, pos.height + BORDER_SIZE.y/2, USE_CASE_SIZE.x, USE_CASE_SIZE.y));

        drawObjName(g);

        // if selected, show the ports
        if (super.selected){
            drawPort(g);
        }
    }



}
