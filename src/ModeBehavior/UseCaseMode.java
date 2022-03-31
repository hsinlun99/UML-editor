package ModeBehavior;

import GraphicDrawing.Object.UseCaseObject;

import java.awt.*;
import java.awt.event.MouseEvent;

public class UseCaseMode extends BaseMode {

    @Override
    public void mouseReleased(MouseEvent e){
        System.out.println("Use Case created");
        baseShapes.add(new UseCaseObject(new Point(e.getX(), e.getY())));
    }

}
