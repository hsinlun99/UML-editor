package ModeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnClass {
    private JButton btnClass = new JButton("Class");

    public BtnClass(){
        BtnHandler btnHandler = new BtnHandler();
        getBtnClass().addActionListener(btnHandler);
    }

    public JButton getBtnClass(){
        return btnClass;
    }


    private class BtnHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            getBtnClass().setBackground(Color.GRAY);
        }
    }
}
