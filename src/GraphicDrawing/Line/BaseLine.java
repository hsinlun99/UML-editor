package GraphicDrawing.Line;

import GraphicDrawing.BaseShape;
import GraphicDrawing.Port;

import java.awt.*;

public abstract class BaseLine extends BaseShape {
    protected Port startPort;
    protected Port endPort;

    public BaseLine(Port _startPort, Port _endPort){
        this.startPort = _startPort;
        this.endPort = _endPort;
    }

    @Override
    public void draw(Graphics g) {
     g.setColor(Color.black);
     ((Graphics2D) g).setRenderingHint(RenderingHints. KEY_ANTIALIASING , RenderingHints. VALUE_ANTIALIAS_ON );
     ((Graphics2D) g).setRenderingHint(RenderingHints. KEY_STROKE_CONTROL , RenderingHints. VALUE_STROKE_DEFAULT );
        Stroke s = new BasicStroke(2f, BasicStroke.CAP_ROUND , BasicStroke. JOIN_MITER );
        ((Graphics2D) g).setStroke(s);
        g.drawLine(startPort.getPos().width,startPort.getPos().height,endPort.getPos().width,endPort.getPos().height);
    }
}
