package ModeButton;

import Editor.Manager;
import ModeBehavior.BaseMode;
import ModeBehavior.UseCaseMode;

public class BtnUseCase extends TglBtnBase{
    private BaseMode mode = new UseCaseMode();
    Manager manager = Manager.getInstance();

    public BtnUseCase(String _btnName){
        super(_btnName);
    }

    @Override
    public void tglBtnOnClick() {
        System.out.println("Use Case click");
        manager.setMode(mode);
//        getTglBtn().setBackground(Color.GRAY);
//        getTglBtn().getModel().setActionCommand(getBtnName());
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
