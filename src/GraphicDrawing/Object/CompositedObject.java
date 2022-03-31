package GraphicDrawing.Object;

import Editor.Manager;
import GraphicDrawing.BaseShape;

import java.awt.*;
import java.util.ArrayList;

public class CompositedObject extends BaseShape {
    private ArrayList<BaseShape> compositedShapes;
    Manager manager = Manager.getInstance();

    public CompositedObject(ArrayList<BaseShape> _baseShapes){
        this.compositedShapes = new ArrayList<>(_baseShapes);
        init();
    }

    // to calculate the composited objects' region positions and size
    private void init(){
        double minX = 1e9;
        double minY = 1e9;
        double maxX = 0;
        double maxY = 0;

        for(BaseShape obj : compositedShapes){
            Dimension pos = obj.getPos();
            Dimension size = obj.getSize();

            minX = Math.min(minX, pos.width);
            minY = Math.min(minY, pos.height);
            maxX = Math.max(maxX, pos.width + size.width);
            maxY = Math.max(maxY, pos.height + size.height);
        }

        super.setPos(minX, minX);
        super.setSize(maxX-minX, maxY-minY);
    }

    @Override
    public void unGroup(){
        manager.getObjs().remove(this);
        manager.getObjs().addAll(getCompositedShapes());
    }

    @Override
    public void draw(Graphics g) {
        for(BaseShape obj : compositedShapes){
            obj.draw(g);
        }
    }

    @Override
    public boolean hasPoint(double _x, double _y){
        for(BaseShape obj : compositedShapes){
            if(obj.hasPoint(_x, _y)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void setSelected(boolean _selected){
        super.setSelected(_selected);
        for(BaseShape obj : compositedShapes){
            obj.setSelected(_selected);
        }
    }

    @Override
    public void setPos(double _x, double _y){
        for(BaseShape obj : compositedShapes){
            obj.setPos(obj.getPos().width+(_x-this.pos.width), obj.getPos().height+(_y-this.pos.height));
        }
        super.setPos(_x, _y);
    }

    public ArrayList<BaseShape> getCompositedShapes(){
        return compositedShapes;
    }
}
