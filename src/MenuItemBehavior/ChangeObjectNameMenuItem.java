package MenuItemBehavior;

import GraphicDrawing.BaseShape;

import javax.swing.*;
import java.util.ArrayList;

public class ChangeObjectNameMenuItem extends BaseMenuItem{

    public ChangeObjectNameMenuItem(String _menuName){
        super(_menuName);
    }

    @Override
    public void menuItemOnclick() {
        ArrayList<BaseShape> allSelectedObjs = manager.getAllSelectedObjs();

        if( allSelectedObjs.size() == 1){
            BaseShape specifiedObj = allSelectedObjs.get(0);
            String originalName = specifiedObj.getName();
            String objName = JOptionPane.showInputDialog(null, "Object name", originalName);

            if(objName == null){
                objName = originalName;
            }
            specifiedObj.setName(objName);
        }else{
            System.out.println("no name changed");
        }

    }
}
