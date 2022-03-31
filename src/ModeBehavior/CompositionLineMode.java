package ModeBehavior;

import ShapeDrawing.BaseShape;
import ShapeDrawing.Line.CompositionLine;
import ShapeDrawing.Port;

import java.awt.event.MouseEvent;

public class CompositionLineMode extends BaseMode {
    public Port startPort;
    public Port endPort;

    @Override
    public void mousePressed(MouseEvent e){
        System.out.println("Comp pressed");

        BaseShape clickObj = getObj(e.getX(), e.getY());

        if(clickObj != null){
            startPort = clickObj.findNearestPort(e.getX(), e.getY());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e){
        if(startPort == null){
            return;
        }

        BaseShape clickObj = getObj(e.getX(), e.getY());

        if(clickObj != null){
            endPort = clickObj.findNearestPort(e.getX(), e.getY());
            if(startPort.getBaseShape() != endPort.getBaseShape()){
                baseShapes.add(new CompositionLine(startPort, endPort));
            }
        }
    }
}
