package ModeButton;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnUseCase {
    private JButton btnUseCase = new JButton("Use Case");

    public BtnUseCase(){
        BtnHandler btnHandler = new BtnHandler();
        getBtnUseCase().addActionListener(btnHandler);
    }

    public JButton getBtnUseCase(){
        return btnUseCase;
    }


    // inner class for button event handling
    private class BtnHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            getBtnUseCase().setBackground(Color.GRAY);
        }
    }

}
