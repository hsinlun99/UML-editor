package ShapeDrawing.Line;

import Editor.Config;
import ShapeDrawing.Port;

import java.awt.*;

public class GeneralizationLine extends BaseLine{

    public GeneralizationLine(Port _startPort, Port _endPort) {
        super(_startPort, _endPort);
    }

    @Override
    public void draw(Graphics g){
        super.draw(g);

        int endPort_x = endPort.getPos().width;
        int endPort_y = endPort.getPos().height;
        int tri_x = Config.LINE_POLYGON_SIZE.width;
        int tri_y = Config.LINE_POLYGON_SIZE.height;

        int[] triX = { endPort_x, endPort_x, endPort_x-tri_x/2};
        int[] triY = {endPort_y+ tri_y/2, endPort_y-tri_y/2, endPort_y};

        g.setColor(Color.GRAY);
        g.fillPolygon(triX, triY, 3);
        g.setColor(Color.black);
        g.drawPolygon(triX, triY, 3);
    }
}
