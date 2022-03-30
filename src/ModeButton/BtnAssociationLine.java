package ModeButton;

public class BtnAssociationLine extends TglBtnBase {

    public BtnAssociationLine(String _btnName){
        super(_btnName);
    }


    @Override
    public void tglBtnOnClick() {
        System.out.println("Assoc click!");

        getTglBtn().getModel().setActionCommand(getBtnName());
    }

}
