import javax.swing.*;
import java.awt.*;

public class Canvas extends JComponent {
    protected JPanel paneCanvas = new JPanel();
    protected JButton btn = new JButton("Canvas");
    protected JTextField txt = new JTextField("testeste");


    public Canvas(){
        getPaneCanvas().add(btn);
        getPaneCanvas().add(txt);
    }

    public JPanel getPaneCanvas() {
        return paneCanvas;
    }


}
