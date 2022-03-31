package ModeButton;

import Editor.Manager;
import ModeBehavior.BaseMode;
import ModeBehavior.SelectMode;

public class BtnSelect extends TglBtnBase{
    private BaseMode mode = new SelectMode();
    Manager manager = Manager.getInstance();

    public BtnSelect(String _btnName){
        super(_btnName);
    }

    @Override
    public void tglBtnOnClick() {
        System.out.println("Select click");
        manager.setMode(mode);

//        getTglBtn().getModel().setActionCommand(getBtnName());

    }

}
