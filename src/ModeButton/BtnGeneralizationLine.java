package ModeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnGeneralizationLine {
    private JButton btnGeneLine = new JButton("Generalization Line");

    public BtnGeneralizationLine(){
        BtnGeneralizationLine.BtnHandler btnHandler = new BtnGeneralizationLine.BtnHandler();
        getBtnGeneLine().addActionListener(btnHandler);
    }

    public JButton getBtnGeneLine() {
        return btnGeneLine;
    }


    private class BtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getBtnGeneLine().setBackground(Color.GRAY);
        }
    }
}
