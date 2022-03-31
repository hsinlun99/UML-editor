package ModeButton;

import Editor.Manager;
import ModeBehavior.AssociationLineMode;
import ModeBehavior.BaseMode;

public class BtnAssociationLine extends TglBtnBase {
    private BaseMode mode = new AssociationLineMode();
    Manager manager = Manager.getInstance();

    public BtnAssociationLine(String _btnName){
        super(_btnName);
    }


    @Override
    public void tglBtnOnClick() {
        System.out.println("Assoc click!");
        manager.setMode(mode);
//        getTglBtn().getModel().setActionCommand(getBtnName());
    }

}
