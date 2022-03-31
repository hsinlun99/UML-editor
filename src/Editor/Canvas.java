package Editor;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JComponent{
    private Manager manager;

    public Canvas(Manager _m){
        this.manager = _m;
//        this.setBackground(Color.white);

        // Create and register listener for mouse and mouse motion events
//        MouseHandler mouseHandler = new MouseHandler();
//        paneCanvas.addMouseListener(mouseHandler);
//        addMouseMotionListener(mouseHandler);

    }

    @Override
    public void paint(Graphics g){
        manager.Paint(g);
    }


//    public void setX(int _x){
//        this.x = _x;
//    }
//    public int getX(){
//        return this.x;
//    }
//    public void setY(int _y){
//        this.y = _y;
//    }
//    public int getY(){
//        return this.y;
//    }
//    public JPanel getPaneCanvas(){
//        return this;
//    }


}
