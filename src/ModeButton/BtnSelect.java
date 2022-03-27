package ModeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnSelect {
    private JButton btnSelect = new JButton("Select");

    public BtnSelect(){
        BtnHandler btnHandler = new BtnHandler();
        getBtnSelect().addActionListener(btnHandler);
    }

    public JButton getBtnSelect(){
        return btnSelect;
    }


    private class BtnHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            getBtnSelect().setBackground(Color.GRAY);
        }
    }
}
