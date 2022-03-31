package MenuItemBehavior;

import GraphicDrawing.BaseShape;

import java.util.ArrayList;

public class UnGroupMenuItem extends BaseMenuItem{

    public UnGroupMenuItem(String _menuName){
        super(_menuName);
    }

    @Override
    public void menuItemOnclick() {
        System.out.println("Ungroup item clicked");

        ArrayList<BaseShape> allSelectedObjs = manager.getAllSelectedObjs();
        if(allSelectedObjs.size() == 1){// if current selected objects is a composited object
            BaseShape baseShape = allSelectedObjs.get(0);
            baseShape.unGroup();
        }else {
            System.out.println("ungroup didn't work!");
        }
    }
}
