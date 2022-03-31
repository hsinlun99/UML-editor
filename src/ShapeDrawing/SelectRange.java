package ShapeDrawing;

import java.awt.*;

public class SelectRange {
    private Dimension start;
    private Dimension end;
    private Dimension pressedStart;
    private Dimension pressedEnd;

    public SelectRange(){
        System.out.println("SelectRange");
    }

    private void calculator(){
        if(start != null && end != null){
            if(pressedStart == null){
                pressedStart = new Dimension(Math.min(start.width, end.width), Math.min(start.height, end.height));
            }else{
                pressedStart.setSize(Math.min(start.width, end.width), Math.min(start.height, end.height));
            }

            if(pressedEnd == null){
                pressedEnd = new Dimension(Math.max(start.width, end.width), Math.max(start.height, end.height));
            }else{
                pressedEnd.setSize(Math.max(start.width, end.width), Math.max(start.height, end.height));
            }
        }
    }

    public boolean contain(Dimension _position, Dimension _size){
        return (pressedStart.width <= _position.width
                && pressedEnd.width >= _position.width + _size.width
                && pressedStart.height <= _position.height
                && pressedEnd.height >= _position.height+ _size.height);
    }

    public void setStart(double _x, double _y){
        if (start == null){
            Dimension d = new Dimension();
            d.setSize(_x, _y);
            start = d;
        }else{
            start.setSize(_x, _y);
        }
    }

    public void setEnd(double _x, double _y){
        if(end == null){
            Dimension d = new Dimension();
            d.setSize(_x, _y);
            end = d;
        }else{
            end.setSize(_x, _y);
        }
        calculator();
    }
}
