package ShapeDrawing.Object;

import Editor.Config;

import java.awt.*;

public class UseCaseObject extends BaseObject{
    public static final Point useCaseSize = Config.USE_CASE_SIZE;
    public static Point borderSize = Config.BORDER_SIZE;

    public UseCaseObject(Point _pos){
        super("Use Case", _pos, useCaseSize);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D
        g2d.setColor(Color.BLACK);
        g2d.fillOval(pos.width, pos.height, useCaseSize.x, useCaseSize.y);
        g2d.setColor(Color.cyan);
        g2d.fillOval(pos.width + borderSize.x/2 , pos.height + borderSize.y/2, useCaseSize.x-borderSize.x , useCaseSize.y - borderSize.y);


//        g2d.setPaint(Color.black);
//        g2d.setStroke(new BasicStroke(5));
//        g2d.draw(new Ellipse2D.Double(2, 2, useCaseSize.x, useCaseSize.y));

        drawObjName(g);

        // if selected, show the ports
        if (super.selected){
            drawPort(g);
        }
    }

}
