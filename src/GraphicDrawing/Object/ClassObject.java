package GraphicDrawing.Object;

import java.awt.*;

public class ClassObject extends BaseObject{
    public static Point classSize = new Point(120, 180);
    public static Point borderSize = new Point(5, 5);
    protected Point name_location = new Point();

    public ClassObject(Point _pos) {
        super("Class", _pos, classSize);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D

//        g2d.setPaint(Color.black);
//        g2d.fill(new Rectangle2D.Double(pos.width, pos.height, classSize.x, classSize.y));
//        g2d.setPaint(Color.orange);
//        g2d.fill(new Rectangle2D.Double(pos.width + borderSize.x/2, pos.height+borderSize.y/2 + classSize.y/4, classSize.x-borderSize.x, classSize.y/3 - borderSize.y));
//        g2d.fill(new Rectangle2D.Double(pos.width+borderSize.x/2, pos.height+borderSize.y/2 + classSize.y/3, classSize.x-borderSize.x, classSize.y/3 - borderSize.y));
//        g2d.fill(new Rectangle2D.Double(pos.width+borderSize.x/2,pos.height+borderSize.y/2 + 2 * classSize.y/3 , classSize.x-borderSize.x, classSize.y/3 - borderSize.y));
//        g2d.fill(new Rectangle2D.Double(7, 118, 90, 30));

        g2d.setColor(Color.BLACK);
        g2d.fillRect(pos.width, pos.height, classSize.x, classSize.y);
        g2d.setColor(Color.orange);
        g2d.fillRect(pos.width+borderSize.x/2, pos.height+borderSize.y/2, classSize.x-borderSize.x, classSize.y/3 - borderSize.y);
        g2d.fillRect(pos.width+borderSize.x/2, pos.height+borderSize.y/2 + classSize.y/3, classSize.x-borderSize.x, classSize.y/3 - borderSize.y);
        g2d.fillRect(pos.width+borderSize.x/2, pos.height+borderSize.y/2 + 2 * classSize.y/3 , classSize.x-borderSize.x, classSize.y/3 - borderSize.y);

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
        name_location.setLocation(pos.width + size.width/2,pos.height + size.height/4);
        g.drawString(name, name_location.x - metrics.stringWidth(name)/2 , name_location.y);
    }
}
