package ModeButton;

public class BtnCompositionLine extends TglBtnBase{

    public BtnCompositionLine(String _btnName){
        super(_btnName);
//        BtnHandler btnHandler = new BtnHandler();
//        getBtnCompLine().addActionListener(btnHandler);
    }

    @Override
    public void tglBtnOnClick() {
        System.out.println("Composition click!");

        getTglBtn().getModel().setActionCommand(getBtnName());

    }
}
