package ModeButton;

import Editor.Manager;
import ModeBehavior.BaseMode;
import ModeBehavior.ClassMode;
import ShapeDrawing.Object.ClassObject;

public class BtnClass extends TglBtnBase{
    private BaseMode mode = new ClassMode();
    Manager manager = Manager.getInstance();

    public BtnClass(String _btnName){
        super(_btnName);
    }


    @Override
    public void tglBtnOnClick() {
        System.out.println("Class click!");
        manager.setMode(mode);
//        getTglBtn().getModel().setActionCommand(getBtnName());

    }

}
