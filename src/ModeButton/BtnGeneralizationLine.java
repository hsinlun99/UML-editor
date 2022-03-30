package ModeButton;

public class BtnGeneralizationLine extends TglBtnBase {

    public BtnGeneralizationLine(String _btnName){
        super(_btnName);
    }

    @Override
    public void tglBtnOnClick() {
        System.out.println("Generalization click!");

        getTglBtn().getModel().setActionCommand(getBtnName());

    }

}
