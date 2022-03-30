package ModeButton;

public class BtnSelect extends TglBtnBase{

    public BtnSelect(String _btnName){
        super(_btnName);
    }

    @Override
    public void tglBtnOnClick() {
        System.out.println("Select click");
        getTglBtn().getModel().setActionCommand(getBtnName());

    }

}
