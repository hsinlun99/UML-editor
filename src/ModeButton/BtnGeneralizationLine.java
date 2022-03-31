package ModeButton;

import Editor.Manager;
import ModeBehavior.BaseMode;
import ModeBehavior.GeneralizationLineMode;

public class BtnGeneralizationLine extends TglBtnBase {
    private BaseMode mode = new GeneralizationLineMode();
    Manager manager = Manager.getInstance();

    public BtnGeneralizationLine(String _btnName){
        super(_btnName);
    }

    @Override
    public void tglBtnOnClick() {
        System.out.println("Generalization click!");
        manager.setMode(mode);

        getTglBtn().getModel().setActionCommand(getBtnName());

    }

}
