package ModeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnGeneralizationLine extends TglBtnBase {

    public BtnGeneralizationLine(String _btnName){
        super(_btnName);
    }

    @Override
    public void tglBtnOnClick() {
        System.out.println("test click!");
    }

}
