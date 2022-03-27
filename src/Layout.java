import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import java.awt.*;

import ModeButton.UseCase;
import ModeBehavior.DrawUseCase;

public class Layout {
    protected JFrame frame = new JFrame("UML Editor");


    public Layout() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
//        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        frame.setContentPane(panel);

        // cstr for GridBagLayout
        GridBagConstraints cstr = new GridBagConstraints();
        cstr.fill = GridBagConstraints.BOTH;
        cstr.insets = new Insets(5, 5, 5, 5);

        // each mode button
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

//        JButton btnUseCase = new JButton("Use Case");
        UseCase btnUseCase = new UseCase();
        setLyoutCstr(cstr, 0, 5, 1, 1, 0, 1);
        panel.add(btnUseCase.getBtnUseCase(), cstr);


        // canvas panel
        Canvas canvas = new Canvas();
        setLyoutCstr(cstr, 1, 0, 6, 6, 1, 1);
        panel.add(canvas.getPaneCanvas(), cstr);


//        frame.pack(); // Adjust the frame's size to fit the inner components.
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public void setLyoutCstr(GridBagConstraints _cstr, int _gridx, int _gridy, int _gridwidth, int _gridheight, int _weightx, int _weighty) {
        _cstr.gridx = _gridx;
        _cstr.gridy = _gridy;
        _cstr.gridwidth = _gridwidth;
        _cstr.gridheight = _gridheight;
        _cstr.weightx = _weightx;
        _cstr.weighty = _weighty;
    }

}
