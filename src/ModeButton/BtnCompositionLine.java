package ModeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnCompositionLine {
    private JButton btnCompLine = new JButton("Composition Line");

    public BtnCompositionLine(){
        BtnHandler btnHandler = new BtnHandler();
        getBtnCompLine().addActionListener(btnHandler);
    }

    public JButton getBtnCompLine() {
        return btnCompLine;
    }


    private class BtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getBtnCompLine().setBackground(Color.GRAY);
        }
    }
}
