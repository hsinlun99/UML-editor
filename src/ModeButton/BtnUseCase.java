package ModeButton;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnUseCase extends TglBtnBase{

    public BtnUseCase(String _btnName){
        super(_btnName);
    }

    @Override
    public void tglBtnOnClick() {

    }


    // inner class for button event handling
//    private class BtnHandler implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            getBtnUseCase().setBackground(Color.GRAY);
//        }
//    }

}
