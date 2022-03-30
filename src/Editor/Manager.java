package Editor;

import ModeBehavior.UseCaseOperation;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;


public class Manager {
    private int x;
    private int y;
    private final ButtonGroup btnGroup = new ButtonGroup();
    private static Manager instance = null; // for singleton
    private Canvas canvas = new Canvas(this);
    private MouseHandler mouseHandler = new MouseHandler();

    public Manager(){
        canvas.addMouseListener(mouseHandler);
    }

    public ButtonGroup getBtnGroup() {
        return this.btnGroup;
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

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public Canvas getCanvas(){
        return this.canvas;
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
//            System.out.println("Current Mode: "+ manager.getBtnGroup().getSelection().getActionCommand());
            setX(e.getX());
            setY(e.getY());
            canvas.add(new UseCaseOperation(e.getX(),e.getY()));
//            paneCanvas.add(new DrawClass(e.getX(),e.getY()));
            canvas.repaint();
            canvas.revalidate();
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
