package Editor;

import ModeBehavior.BaseMode;
import ShapeDrawing.BaseShape;
import ShapeDrawing.SelectRange;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


public class Manager {
    private final ButtonGroup btnGroup = new ButtonGroup();
    private BaseMode mode;
    private static Manager instance = null; // for singleton
    private Canvas canvas = new Canvas(this);
    private MouseHandler mouseHandler = new MouseHandler();

    private ArrayList<BaseShape> objs;
    private ArrayList<BaseShape> lineObjs = new ArrayList<>();
    private SelectRange selectRange = new SelectRange();
    private ArrayList<BaseShape> allSelected = new ArrayList<>();


    public ButtonGroup getBtnGroup() {
        return this.btnGroup;
    }

    // for singleton
    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public Canvas getCanvas(){
        return this.canvas;
    }

    public ArrayList<BaseShape> getObjs() {
        return objs;
    }

    public ArrayList<BaseShape> getLineObjs() {
        return lineObjs;
    }

    public void setMode(BaseMode _mode) {
        this.mode = _mode;
    }

    public SelectRange getSelectRange(){
        return this.selectRange;
    }

    public ArrayList<BaseShape> getAllSelectedObjs() {
        return this.allSelected;
    }


    public Manager(){
        canvas.addMouseListener(mouseHandler);
        canvas.addMouseMotionListener(mouseHandler);

        objs = new ArrayList<>();
    }

    // main paint
    public void Paint(Graphics g){

        // Because canvas is a Jcomponent which doesn't have setBackground method, paint it white here.
        Dimension dim = canvas.getSize();
        g.setColor(Color.white);
        g.fillRect(0, 0, dim.width, dim.height);


        // paint object and line onto canvas
        for(BaseShape d : lineObjs)
            d.draw(g);
        for(BaseShape d : objs)
            d.draw(g);
    }

    private class MouseHandler implements MouseInputListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            mode.mouseClicked(e);
            canvas.repaint();
            canvas.revalidate();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            mode.mousePressed(e);
            canvas.repaint();
            canvas.revalidate();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            mode.mouseReleased(e);
            canvas.repaint();
            canvas.revalidate();

////            System.out.println("Current Mode: "+ manager.getBtnGroup().getSelection().getActionCommand());
//            setX(e.getX());
//            setY(e.getY());
//            canvas.add(new UseCaseMode(e.getX(),e.getY()));
////            paneCanvas.add(new DrawClass(e.getX(),e.getY()));
//            canvas.repaint();
//            canvas.revalidate();
//            System.out.println("released at [" + getX() + ", " + getY() + "]");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            canvas.repaint();
            canvas.revalidate();
        }

        @Override
        public void mouseExited(MouseEvent e) {
            canvas.repaint();
            canvas.revalidate();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            mode.mouseDragged(e);
            canvas.repaint();
            canvas.revalidate();
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            canvas.repaint();
            canvas.revalidate();
        }
    }
}
