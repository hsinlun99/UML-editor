package GraphicDrawing.Line;

import GraphicDrawing.Port;

import java.awt.*;

public class CompositionLine extends BaseLine{

    public CompositionLine(Port _startPort, Port _endPort) {
        super(_startPort, _endPort);
    }

    @Override
    public void draw(Graphics g){
        super.draw(g);

        int endPort_x= endPort.getPos().width;
        int endPort_y = endPort.getPos().height;
        int polygon_x = 15;
        int polygon_y = 15;

        // calculate the diamond positions
        int[] rectX = { endPort_x, endPort_x+polygon_x - polygon_x/2, endPort_x, endPort_x - polygon_x/2};
        int[] rectY = { endPort_y - polygon_y/2, endPort_y, endPort_y + polygon_y/2, endPort_y };

        g.setColor(Color.white);
        g.fillPolygon(rectX, rectY, 4);
        g.setColor(Color.black);
        g.fillPolygon(rectX, rectY, 4);
    }
}
