package ModeButton;

import javax.swing.*;
import javax.swing.plaf.MenuItemUI;
import javax.swing.plaf.metal.MetalButtonUI;
import javax.swing.plaf.metal.MetalToggleButtonUI;
import java.awt.*;

public abstract class TglBtnBase {
    private JToggleButton tglBtn;
    protected String btnName;

    public TglBtnBase(String _btnName) {
        tglBtn = new JToggleButton();

        tglBtn.setText(_btnName);
        setBtnName(_btnName);

        tglBtn.addActionListener(e -> tglBtnOnClick());

        tglBtn.setUI(new MetalToggleButtonUI(){
            @Override
            protected Color getSelectColor(){
                return Color.GRAY;
            }
        });
    }

    public void setBtnName(String _btnName) {
        this.btnName = _btnName;
    }

    public String getBtnName(){
        return this.btnName;
    }

    public JToggleButton getTglBtn(){
        return this.tglBtn;
    }

    public abstract void tglBtnOnClick();
}
