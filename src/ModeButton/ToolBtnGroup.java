package ModeButton;

import javax.swing.*;

public class ToolBtnGroup {
    private final ButtonGroup btnGroup = new ButtonGroup();
    private static ToolBtnGroup instance = null; // for singleton

    public ToolBtnGroup(){
        //可能需要傳一些東西讓mode切換

    }

    public ButtonGroup getBtnGroup() {
        return this.btnGroup;
    }

    public static ToolBtnGroup getInstance() {
        if (instance == null) {
            instance = new ToolBtnGroup();
        }
        return instance;
    }

}
