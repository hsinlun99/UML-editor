package Editor;

import javax.swing.*;
import java.awt.*;

import MenuItemBehavior.ChangeObjectNameMenuItem;
import MenuItemBehavior.GroupMenuItem;
import MenuItemBehavior.UnGroupMenuItem;
import ModeButton.*;

public class Layout {
    protected JFrame frame = new JFrame("UML Editor");
    private Manager manager;

    public Layout() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //menu bar
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        GroupMenuItem groupMenuItem = new GroupMenuItem("Group");
        UnGroupMenuItem unGroupMenuItem = new UnGroupMenuItem("UnGroup");
        ChangeObjectNameMenuItem changeObjectNameMenuItem = new ChangeObjectNameMenuItem("Change object name");

        edit.add(groupMenuItem.getMenuItem());
        edit.add(unGroupMenuItem.getMenuItem());
        edit.add(changeObjectNameMenuItem.getMenuItem());

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file);
        menuBar.add(edit);
        frame.setJMenuBar(menuBar);

        // the main container of the frame
        JPanel panel = new JPanel(new GridBagLayout());
//        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        frame.setContentPane(panel);

        // cstr for GridBagLayout
        GridBagConstraints cstr = new GridBagConstraints();
        cstr.fill = GridBagConstraints.BOTH;
        cstr.insets = new Insets(5, 5, 5, 5);

        // button group for toggling button
        manager = Manager.getInstance();

        // each mode button
        BtnSelect btnSelect = new BtnSelect("Select");
        setLayoutCstr(cstr, 0, 0, 1, 1, 0, 1);
        panel.add(btnSelect.getTglBtn(), cstr);
        manager.getBtnGroup().add(btnSelect.getTglBtn());

        BtnAssociationLine btnAssocLine = new BtnAssociationLine("Association Line");
        setLayoutCstr(cstr, 0, 1, 1, 1, 0, 1);
        panel.add(btnAssocLine.getTglBtn(), cstr);
        manager.getBtnGroup().add(btnAssocLine.getTglBtn());

        BtnGeneralizationLine btnGeneLine = new BtnGeneralizationLine("Generalization Line");
        setLayoutCstr(cstr, 0, 2, 1, 1, 0, 1);
        panel.add(btnGeneLine.getTglBtn(), cstr);
        manager.getBtnGroup().add(btnGeneLine.getTglBtn());

        BtnCompositionLine btnCompLine = new BtnCompositionLine("Composition Line");
        setLayoutCstr(cstr, 0, 3, 1, 1, 0, 1);
        panel.add(btnCompLine.getTglBtn(), cstr);
        manager.getBtnGroup().add(btnCompLine.getTglBtn());

        BtnClass btnClass = new BtnClass("Class");
        setLayoutCstr(cstr, 0, 4, 1, 1, 0, 1);
        panel.add(btnClass.getTglBtn(), cstr);
        manager.getBtnGroup().add(btnClass.getTglBtn());

        BtnUseCase btnUseCase = new BtnUseCase("Use Case");
        setLayoutCstr(cstr, 0, 5, 1, 1, 0, 1);
        panel.add(btnUseCase.getTglBtn(), cstr);
        manager.getBtnGroup().add(btnUseCase.getTglBtn());

        // canvas panel
        setLayoutCstr(cstr, 1, 0, 6, 6, 1, 1);
        panel.add(manager.getCanvas(), cstr);


//        frame.pack(); // Adjust the frame's size to fit the inner components.
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public void setLayoutCstr(GridBagConstraints _cstr, int _gridx, int _gridy, int _gridwidth, int _gridheight, int _weightx, int _weighty) {
        _cstr.gridx = _gridx;
        _cstr.gridy = _gridy;
        _cstr.gridwidth = _gridwidth;
        _cstr.gridheight = _gridheight;
        _cstr.weightx = _weightx;
        _cstr.weighty = _weighty;
    }

}
