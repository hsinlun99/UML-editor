package ModeBehavior;
import Editor.Manager;
import ShapeDrawing.BaseShape;
import ShapeDrawing.Line.BaseLine;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

public abstract class BaseMode {
    protected Manager manager;
    protected ArrayList<BaseShape> baseShapes;
    protected ArrayList<BaseShape> baselines;

    public BaseMode(){
        manager = Manager.getInstance();
        this.baseShapes = manager.getObjs();
        this.baselines = manager.getLineObjs();
    }

    // Get selected Objs (in select mode)
    protected BaseShape getObj(double _x, double _y){
        for (BaseShape obj : baseShapes){
            if (obj.hasPoint(_x, _y)){
                return obj;
            }
        }
        return null;
    }

    // mouse event to draw objects and shapes (in other modes)
    public void mouseClicked(MouseEvent _e) {
    }
    public void mouseReleased(MouseEvent _e) {
    }
    public void mousePressed(MouseEvent _e) {
    }
    public void mouseDragged(MouseEvent _e){
    }
}
