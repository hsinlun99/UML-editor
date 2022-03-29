import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.*;
import ModeButton.*;

public class Layout {
    protected JFrame frame = new JFrame("UML Editor");
    private ToolBtnGroup toolBtnGroup;

    public Layout() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
//        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        frame.setContentPane(panel);

        // cstr for GridBagLayout
        GridBagConstraints cstr = new GridBagConstraints();
        cstr.fill = GridBagConstraints.BOTH;
        cstr.insets = new Insets(5, 5, 5, 5);

        // button group for toggling button
        toolBtnGroup = ToolBtnGroup.getInstance();

        // each mode button
        BtnSelect btnSelect = new BtnSelect("Select");
        setLayoutCstr(cstr, 0, 0, 1, 1, 0, 1);
        panel.add(btnSelect.getTglBtn(), cstr);
        toolBtnGroup.getBtnGroup().add(btnSelect.getTglBtn());

        BtnAssociationLine btnAssocLine = new BtnAssociationLine("Association Line");
        setLayoutCstr(cstr, 0, 1, 1, 1, 0, 1);
        panel.add(btnAssocLine.getTglBtn(), cstr);
        toolBtnGroup.getBtnGroup().add(btnAssocLine.getTglBtn());

        BtnGeneralizationLine btnGeneLine = new BtnGeneralizationLine("Generalization Line");
        setLayoutCstr(cstr, 0, 2, 1, 1, 0, 1);
        panel.add(btnGeneLine.getTglBtn(), cstr);
        toolBtnGroup.getBtnGroup().add(btnGeneLine.getTglBtn());

        BtnCompositionLine btnCompLine = new BtnCompositionLine("Composition Line");
        setLayoutCstr(cstr, 0, 3, 1, 1, 0, 1);
        panel.add(btnCompLine.getTglBtn(), cstr);
        toolBtnGroup.getBtnGroup().add(btnCompLine.getTglBtn());

        BtnClass btnClass = new BtnClass("Class");
        setLayoutCstr(cstr, 0, 4, 1, 1, 0, 1);
        panel.add(btnClass.getTglBtn(), cstr);
        toolBtnGroup.getBtnGroup().add(btnClass.getTglBtn());

        BtnUseCase btnUseCase = new BtnUseCase("Use Case");
        setLayoutCstr(cstr, 0, 5, 1, 1, 0, 1);
        panel.add(btnUseCase.getTglBtn(), cstr);
        toolBtnGroup.getBtnGroup().add(btnUseCase.getTglBtn());

        // canvas panel
        Canvas canvas = new Canvas();
        setLayoutCstr(cstr, 1, 0, 6, 6, 1, 1);
        panel.add(canvas.getPaneCanvas(), cstr);


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
