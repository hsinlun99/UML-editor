package GraphicDrawing;

import java.awt.*;

public class Port {
    private Dimension pos = new Dimension();
    private BaseShape baseShape;

    public Port(BaseShape _baseShape){
        this.baseShape = _baseShape;
    }

    public Dimension getPos(){// get pos dimension
        return pos;
    }

    public void setPos(double _x, double _y){
        pos.setSize(_x, _y);
    }

    public BaseShape getBaseShape(){
        return this.baseShape;
    }
}
