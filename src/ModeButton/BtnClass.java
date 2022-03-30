package ModeButton;

public class BtnClass extends TglBtnBase{

    public BtnClass(String _btnName){
        super(_btnName);
    }


    @Override
    public void tglBtnOnClick() {
        System.out.println("Class click!");

        getTglBtn().getModel().setActionCommand(getBtnName());

    }

}
