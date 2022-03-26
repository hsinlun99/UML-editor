import javax.swing.*;
import java.awt.*;

public class Layout {
    public Layout(){
        JFrame frame = new JFrame("UML Editor");
//        frame.setSize(1024, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        frame.setContentPane(panel);

        // cstr for GridBagLayout
        GridBagConstraints cstr = new GridBagConstraints();
        cstr.weightx = 1;
        cstr.weighty = 1;
        cstr.fill = GridBagConstraints.BOTH;

        // button(mode) list
        JPanel paneModeList = new JPanel(new GridBagLayout());
        cstr.gridx = 0;
        cstr.gridy = 0;
        cstr.gridwidth = 1;
        cstr.gridheight = 6;
        panel.add(paneModeList, cstr);

        GridBagConstraints cstrModeBtn = new GridBagConstraints();
        cstrModeBtn.weightx = 1;
        cstrModeBtn.weighty = 1;
        cstrModeBtn.fill = GridBagConstraints.BOTH;

        JButton btnSelect = new JButton("Select");
        cstrModeBtn.gridx = 0;
        cstrModeBtn.gridy = 0;
        paneModeList.add(btnSelect, cstrModeBtn);


        JButton btnAssocLine = new JButton("Association Line");
        cstrModeBtn.gridx = 0;
        cstrModeBtn.gridy = 1;
        paneModeList.add(btnAssocLine, cstrModeBtn);


        JButton btnGeneLine = new JButton("Generalization Line");
        cstrModeBtn.gridx = 0;
        cstrModeBtn.gridy = 2;
        paneModeList.add(btnGeneLine, cstrModeBtn);


        JButton btnCompLine = new JButton("Composition Line");
        cstrModeBtn.gridx = 0;
        cstrModeBtn.gridy = 3;
        paneModeList.add(btnCompLine, cstrModeBtn);


        JButton btnClass = new JButton("Class");
        cstrModeBtn.gridx = 0;
        cstrModeBtn.gridy = 4;
        paneModeList.add(btnClass, cstrModeBtn);


        JButton btnUseCase = new JButton("Use Case");
        cstrModeBtn.gridx = 0;
        cstrModeBtn.gridy = 5;
        paneModeList.add(btnUseCase, cstrModeBtn);


        // canvas panel
        GridBagConstraints cstrCanvas = new GridBagConstraints();
        JPanel paneCanvas = new JPanel();
        paneCanvas.setBackground(Color.white);
        cstrCanvas.gridx = 1;
        cstrCanvas.gridy = 0;
        cstrCanvas.gridwidth = 6;
        cstrCanvas.gridheight = 6;
        cstrCanvas.weightx = 1;
        cstrCanvas.weighty = 1;
        cstrCanvas.fill = GridBagConstraints.BOTH;
        cstrCanvas.anchor = GridBagConstraints.WEST;

        panel.add(paneCanvas, cstrCanvas);

        frame.pack(); // Adjust the frame's size to fit the inner components.
        frame.setVisible(true);
    }
}
