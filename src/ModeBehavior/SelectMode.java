package ModeBehavior;

import GraphicDrawing.BaseShape;
import GraphicDrawing.SelectRange;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class SelectMode extends BaseMode{
    private SelectRange selectRange;

    private final ArrayList<BaseShape> allselectedObjs;

    // Drag object
    private BaseShape selectedObj;
    private Dimension startDragPos;

    // initial position before grad / range
    private Dimension initPos;

    public SelectMode(){
        super();
        this.selectRange = manager.getSelectRange();
        this.allselectedObjs = manager.getAllSelectedObjs();
    }

    @Override
    public void mousePressed(MouseEvent e){
        System.out.println("select Mouse pressed at " + e.getX() + ", " + e.getY());

        selectedObj = null;

        for(BaseShape obj : baseShapes){
            obj.setSelected(false);
        }

        allselectedObjs.clear();

        // To see if click on an object
        selectedObj = getObj(e.getX(), e.getY());
        // if so, get ready for dragging
        if(selectedObj != null){
            System.out.println("click on object");
            selectedObj.setSelected(true);
            startDragPos = new Dimension(e.getX(), e.getY());
            initPos = new Dimension(selectedObj.getPos().width, selectedObj.getPos().height);
        }else{
            // if not, create a select range
            selectRange.setStart(e.getX(), e.getY());
        }
    }

    @Override
    public void mouseDragged(MouseEvent e){
//        System.out.println("select Mouse dragged at " + e.getX() + ", " + e.getY());


        if(selectedObj != null){
            selectedObj.setPos(initPos.width + (e.getX()- startDragPos.width), initPos.height+(e.getY()- startDragPos.height) );
        }else{
            selectRange.setEnd(e.getX(),e.getY());
            for(BaseShape obj : baseShapes){
                obj.setSelected(selectRange.contain(obj.getPos(), obj.getSize()));
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e){
        System.out.println("select Mouse released at " + e.getX() + ", " + e.getY());


        for (BaseShape obj : baseShapes){
            if (obj.isSelected()) {
                allselectedObjs.add(obj);
            }
        }
    }
}
