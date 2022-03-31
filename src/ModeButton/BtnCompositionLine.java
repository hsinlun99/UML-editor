package ModeButton;

import Editor.Manager;
import ModeBehavior.BaseMode;
import ModeBehavior.CompositionLineMode;

public class BtnCompositionLine extends TglBtnBase{
    private BaseMode mode = new CompositionLineMode();
    Manager manager = Manager.getInstance();

    public BtnCompositionLine(String _btnName){
        super(_btnName);
//        BtnHandler btnHandler = new BtnHandler();
//        getBtnCompLine().addActionListener(btnHandler);
    }

    @Override
    public void tglBtnOnClick() {
        System.out.println("Composition click!");
        manager.setMode(mode);

//        getTglBtn().getModel().setActionCommand(getBtnName());

    }
}
