package ModeBehavior;

import ShapeDrawing.BaseShape;
import ShapeDrawing.Line.GeneralizationLine;
import ShapeDrawing.Port;

import java.awt.event.MouseEvent;

public class GeneralizationLineMode extends BaseMode{
    public Port startPort;
    public Port endPort;

    @Override
    public void mousePressed(MouseEvent e){
        BaseShape clickObj = getObj(e.getX(), e.getY());
        if(clickObj != null){
            startPort = clickObj.findNearestPort(e.getX(),e.getY());
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
                baseShapes.add(new GeneralizationLine(startPort, endPort));
            }
        }
    }
}
