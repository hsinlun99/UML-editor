package MenuItemBehavior;

import Editor.Manager;

import javax.swing.*;

public abstract class BaseMenuItem {
    protected JMenuItem menuItem;
    protected Manager manager = Manager.getInstance();

    public BaseMenuItem(String _menuName){
        menuItem = new JMenuItem(_menuName);
        menuItem.addActionListener(e -> menuItemOnclick());
    }

    public JMenuItem getMenuItem(){
        return this.menuItem;
    }

    public abstract void menuItemOnclick();
}
