package ModeBehavior;

import GraphicDrawing.BaseShape;
import GraphicDrawing.Line.AssociationLine;
import GraphicDrawing.Port;

import java.awt.event.MouseEvent;

public class AssociationLineMode extends BaseMode{
    public Port startPort;
    public Port endPort;

    @Override
    public void mousePressed(MouseEvent e){
        BaseShape clickObj = getObj(e.getX(), e.getY());

        if (clickObj != null){
            startPort = clickObj.findNearestPort(e.getX(), e.getY());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e){
        if (startPort == null){
            return;
        }
        BaseShape clickObj = getObj(e.getX(), e.getY());

        if (clickObj != null){
            endPort = clickObj.findNearestPort(e.getX(), e.getY());

            // you can't create a line on a point
            if(startPort.getBaseShape() != endPort.getBaseShape()){
                baseShapes.add(new AssociationLine(startPort, endPort));
            }
        }
    }
}
