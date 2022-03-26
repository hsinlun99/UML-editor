import javax.swing.*;
import java.awt.*;

public class Layout {
    protected JFrame frame = new JFrame("UML Editor");


    public Layout(){
        frame.setSize(1024, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
//        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        frame.setContentPane(panel);

        // cstr for GridBagLayout
        GridBagConstraints cstr = new GridBagConstraints();
        cstr.fill = GridBagConstraints.BOTH;
        cstr.insets = new Insets(5, 5, 5, 5);

        JButton btnSelect = new JButton("Select");
        setLyoutCstr(cstr, 0, 0, 1, 1, 0, 1);
        panel.add(btnSelect, cstr);


        JButton btnAssocLine = new JButton("Association Line");
        setLyoutCstr(cstr, 0, 1, 1, 1, 0, 1);
        panel.add(btnAssocLine, cstr);


        JButton btnGeneLine = new JButton("Generalization Line");
        setLyoutCstr(cstr, 0, 2, 1, 1, 0, 1);
        panel.add(btnGeneLine, cstr);


        JButton btnCompLine = new JButton("Composition Line");
        setLyoutCstr(cstr, 0, 3, 1, 1, 0, 1);
        panel.add(btnCompLine, cstr);


        JButton btnClass = new JButton("Class");
        setLyoutCstr(cstr, 0, 4, 1, 1, 0, 1);
        panel.add(btnClass, cstr);




        JButton btnUseCase = new JButton("Use Case");
        setLyoutCstr(cstr, 0, 5, 1, 1, 0, 1);
        panel.add(btnUseCase, cstr);


        // canvas panel
        JPanel paneCanvas = new JPanel();
        paneCanvas.setBackground(Color.white);
        setLyoutCstr(cstr, 1, 0, 6, 6, 1, 1);
        panel.add(paneCanvas, cstr);

//        frame.pack(); // Adjust the frame's size to fit the inner components.
        frame.setVisible(true);
    }

    public void setLyoutCstr(GridBagConstraints _cstr, int _gridx, int _gridy, int _gridwidth, int _gridheight, int _weightx, int _weighty){
        _cstr.gridx = _gridx;
        _cstr.gridy = _gridy;
        _cstr.gridwidth = _gridwidth;
        _cstr.gridheight = _gridwidth;
        _cstr.weightx = _weightx;
        _cstr.weighty = _weighty;
    }

}
