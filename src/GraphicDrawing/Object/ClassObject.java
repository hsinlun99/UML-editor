package GraphicDrawing.Object;

import java.awt.*;

public class ClassObject extends BaseObject{
    public static Point CLASS_SIZE = new Point(120, 180);
    public static Point BORDER_SIZE = new Point(5, 5);
    protected Point NAME_LOCATION = new Point();

    public ClassObject(Point _pos) {
        super("Class", _pos, CLASS_SIZE);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D

//        g2d.setPaint(Color.black);
//        g2d.fill(new Rectangle2D.Double(pos.width, pos.height, CLASS_SIZE.x, CLASS_SIZE.y));
//        g2d.setPaint(Color.orange);
//        g2d.fill(new Rectangle2D.Double(pos.width + BORDER_SIZE.x/2, pos.height+BORDER_SIZE.y/2 + CLASS_SIZE.y/4, CLASS_SIZE.x-BORDER_SIZE.x, CLASS_SIZE.y/3 - BORDER_SIZE.y));
//        g2d.fill(new Rectangle2D.Double(pos.width+BORDER_SIZE.x/2, pos.height+BORDER_SIZE.y/2 + CLASS_SIZE.y/3, CLASS_SIZE.x-BORDER_SIZE.x, CLASS_SIZE.y/3 - BORDER_SIZE.y));
//        g2d.fill(new Rectangle2D.Double(pos.width+BORDER_SIZE.x/2,pos.height+BORDER_SIZE.y/2 + 2 * CLASS_SIZE.y/3 , CLASS_SIZE.x-BORDER_SIZE.x, CLASS_SIZE.y/3 - BORDER_SIZE.y));
//        g2d.fill(new Rectangle2D.Double(7, 118, 90, 30));

        g2d.setColor(Color.BLACK);
        g2d.fillRect(pos.width, pos.height, CLASS_SIZE.x, CLASS_SIZE.y);
        g2d.setColor(Color.orange);
        g2d.fillRect(pos.width+BORDER_SIZE.x/2, pos.height+BORDER_SIZE.y/2, CLASS_SIZE.x-BORDER_SIZE.x, CLASS_SIZE.y/3 - BORDER_SIZE.y);
        g2d.fillRect(pos.width+BORDER_SIZE.x/2, pos.height+BORDER_SIZE.y/2 + CLASS_SIZE.y/3, CLASS_SIZE.x-BORDER_SIZE.x, CLASS_SIZE.y/3 - BORDER_SIZE.y);
        g2d.fillRect(pos.width+BORDER_SIZE.x/2, pos.height+BORDER_SIZE.y/2 + 2 * CLASS_SIZE.y/3 , CLASS_SIZE.x-BORDER_SIZE.x, CLASS_SIZE.y/3 - BORDER_SIZE.y);

        drawObjName(g);

        if(super.selected){
            drawPort(g);
        }
    }

    @Override
    public void drawObjName(Graphics g){
        FontMetrics metrics = g.getFontMetrics();
        g.setFont(new Font("arial", Font.BOLD, 16));
        g.setColor(Color.black);
        NAME_LOCATION.setLocation(pos.width + size.width/2,pos.height + size.height/4);
        g.drawString(name, NAME_LOCATION.x - metrics.stringWidth(name)/2 , NAME_LOCATION.y);
    }
}
