package ModeButton;

import javax.swing.*;

public abstract class TglBtnBase {
    private JToggleButton tglBtn;

    public TglBtnBase(String _btnName) {
        tglBtn = new JToggleButton();

        tglBtn.setText(_btnName);

        tglBtn.addActionListener(e -> tglBtnOnClick());
    }

    public JToggleButton getTglBtn(){
        return this.tglBtn;
    }

    public abstract void tglBtnOnClick();
}
