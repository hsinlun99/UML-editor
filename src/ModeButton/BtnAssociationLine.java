package ModeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnAssociationLine {
    private JButton btnAssocLine = new JButton("Association Line");

    public BtnAssociationLine(){
        BtnHandler btnHandler = new BtnHandler();
        getBtnAssocLine().addActionListener(btnHandler);
    }

    public JButton getBtnAssocLine() {
        return btnAssocLine;
    }


    private class BtnHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            getBtnAssocLine().setBackground(Color.GRAY);
        }
    }
}
