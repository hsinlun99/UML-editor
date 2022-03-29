import ModeBehavior.DrawUseCase;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Canvas {

    private int x;
    private int y;
    private JPanel paneCanvas = new JPanel();

    public Canvas(){
        paneCanvas.setBackground(Color.white);

        // Create and register listener for mouse and mouse motion events
        MouseHandler mouseHandler = new MouseHandler();
        paneCanvas.addMouseListener(mouseHandler);
//        addMouseMotionListener(mouseHandler);

    }

    public void setX(int _x){
        this.x = _x;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int _y){
        this.y = _y;
    }
    public int getY(){
        return this.y;
    }
    public JPanel getPaneCanvas(){
        return this.paneCanvas;
    }

    private class MouseHandler implements MouseInputListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            setX(e.getX());
            setY(e.getY());
            paneCanvas.add(new DrawUseCase(e.getX(),e.getY()));
            paneCanvas.repaint();
            paneCanvas.revalidate();
            System.out.println("released at [" + getX() + ", " + getY() + "]");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }
}
