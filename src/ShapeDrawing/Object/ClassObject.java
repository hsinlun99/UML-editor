package ShapeDrawing.Object;

import Editor.Config;

import java.awt.*;

public class ClassObject extends BaseObject{
    public static Point classSize = Config.CLASS_SIZE;
    public static Point borderSize = Config.BORDER_SIZE;
    protected Point name_location = new Point();

    public ClassObject(Point _pos) {
        super("Class", _pos, classSize);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(pos.width, pos.height, classSize.x, classSize.y);
        g.setColor(Color.orange);
        g.fillRect(pos.width+borderSize.x/2, pos.height+borderSize.y/2, classSize.x-borderSize.x, classSize.y/3 - borderSize.y);
        g.fillRect(pos.width+borderSize.x/2, pos.height+borderSize.y/2 + classSize.y/3, classSize.x-borderSize.x, classSize.y/3 - borderSize.y);
        g.fillRect(pos.width+borderSize.x/2, pos.height+borderSize.y/2 + 2 * classSize.y/3 , classSize.x-borderSize.x, classSize.y/3 - borderSize.y);

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
