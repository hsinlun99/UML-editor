package GraphicDrawing.Object;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class UseCaseObject extends BaseObject{
    public static final Point useCaseSize = new Point(120, 80);
    public static Point borderSize = new Point(5, 5);

    public UseCaseObject(Point _pos){
        super("Use Case", _pos, useCaseSize);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D

        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(new Ellipse2D.Double(pos.width + borderSize.x/2, pos.height + borderSize.y/2, useCaseSize.x, useCaseSize.y));

        drawObjName(g);

        // if selected, show the ports
        if (super.selected){
            drawPort(g);
        }
    }



}
