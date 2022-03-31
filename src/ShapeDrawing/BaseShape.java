package ShapeDrawing;

import java.awt.*;

public abstract class BaseShape {
    protected final Dimension pos = new Dimension();
    protected final Dimension size = new Dimension();
    protected boolean selected = false;
    // object Name
    protected String name;

    public abstract void draw(Graphics g);

    public boolean hasPoint(double _x,double _y){
        return (pos.width <= _x && _x <=pos.width +size.width &&
                pos.height <= _y && _y<= pos.height +size.height );
    }

    // get the nearest port from mouse current position
    public Port findNearestPort(double _x, double _y){
        return null;
    }

    // Selected
    public boolean isSelected(){ return  selected; }
    public void setSelected(boolean _selected){
        this.selected = _selected;
    }

    // Pos
    public Dimension getPos(){return pos;}
    public void setPos(double _x,double _y){
        pos.setSize(_x, _y);
    }

    // Size
    public Dimension getSize(){return size;}
    public void setSize(double _x, double _y){
        size.setSize(_x,_y);
    }

    // Name
    public String  getName(){return name;}
    public void setName(String _name){
        this.name = _name;
    }

    public void unGroup(){}

}
