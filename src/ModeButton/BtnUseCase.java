package ModeButton;

import java.awt.*;

public class BtnUseCase extends TglBtnBase{

    public BtnUseCase(String _btnName){
        super(_btnName);
    }

    @Override
    public void tglBtnOnClick() {
        System.out.println("Use Case click");
//        getTglBtn().setBackground(Color.GRAY);
        getTglBtn().getModel().setActionCommand(getBtnName());
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
