package ModeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnAssociationLine extends TglBtnBase {

    public BtnAssociationLine(String _btnName){
        super(_btnName);
    }


    @Override
    public void tglBtnOnClick() {
        System.out.println("Assoc click!");
    }

}
