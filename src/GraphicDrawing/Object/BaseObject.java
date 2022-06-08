package GraphicDrawing.Object;


import GraphicDrawing.BaseShape;
import GraphicDrawing.Port;

import java.awt.*;

public abstract class BaseObject extends BaseShape {
    public static int PORT_SIZE_X = 10;
    public static int PORT_SIZE_Y = 10;

    protected Dimension center = new Dimension();
    protected Port[] Ports = new Port[4];

    public BaseObject(String _name, Point _pos, Point _size){
        this.name = _name;
        this.pos.setSize(_pos.x, _pos.y);
        this.size.setSize(_size.x, _size.y);

        for (int i=0; i<Ports.length; i++){
            Ports[i] = new Port(this);
        }

        setPortPos();
    }

    // set ports' position on the object
    private void setPortPos(){
        center.setSize(pos.width + size.width/2, pos.height + size.height/2);

        Ports[0].setPos(pos.width + (size.width >> 1), pos.height); // upper center
        Ports[1].setPos(pos.width + size.width, pos.height + (size.height >> 1)); // right center
        Ports[2].setPos(pos.width + (size.width >> 1), pos.height + size.height); // Below center
        Ports[3].setPos(pos.width, pos.height + (size.height >> 1)); // Left center
    }

    @Override
    public void setPos(double _x, double _y){
        super.setPos(_x, _y);
        setPortPos();
    }

    @Override
    public void setSize(double _x, double _y) {
        super.setSize(_x, _y);
        setPortPos();
    }

    // port graphic
    public void drawPort(Graphics _g){
        for(Port p : Ports){
            _g.setColor(Color.black);
            _g.fillOval(p.getPos().width - PORT_SIZE_X/2, p.getPos().height - PORT_SIZE_Y/2, PORT_SIZE_X, PORT_SIZE_Y);
        }
    }

    @Override
    public Port findNearestPort(double _x, double _y) {
        Port firstPort = Ports[0];
        double nearDis = 1e10;
        double distance;

        for (Port p : Ports) {
            distance = (p.getPos().width - _x) * (p.getPos().width - _x) + (p.getPos().height - _y) * (p.getPos().height - _y);
            if (distance < nearDis) {
                nearDis = Math.min(nearDis, distance);
                firstPort = p;
            }
        }
        return firstPort;
    }

    public void drawObjName(Graphics g) {
        FontMetrics metrics = g.getFontMetrics();
        g.setFont(new Font("arial", Font.BOLD, 16));
        g.setColor(Color.black);
        g.drawString(name, center.width - metrics.stringWidth(name)/2, center.height);

    }

}
