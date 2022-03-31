package MenuItemBehavior;

import GraphicDrawing.BaseShape;
import GraphicDrawing.Object.CompositedObject;

import java.util.ArrayList;

public class GroupMenuItem extends BaseMenuItem{

    public GroupMenuItem(String _menuName){
        super(_menuName);
    }

    @Override
    public void menuItemOnclick() {
        ArrayList<BaseShape> allSelectedObjs = manager.getAllSelectedObjs();

        // can be grouped
        if(allSelectedObjs.size() > 1){
            // set all the selected objects as composited object
            CompositedObject compositedObj = new CompositedObject(allSelectedObjs);

            manager.getObjs().removeAll(allSelectedObjs);// remove the selected objs from manager
            manager.getObjs().add(compositedObj); // add them back in as a composited object
            allSelectedObjs.clear();
            allSelectedObjs.add(compositedObj);
        }
    }
}
