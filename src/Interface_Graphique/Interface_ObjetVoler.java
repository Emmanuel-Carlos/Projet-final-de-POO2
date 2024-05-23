package Interface_Graphique;

import javax.swing.*;
import java.awt.*;

public class Interface_ObjetVoler  extends JPanel {
    private JTabbedPane tabbedPane;
    private JPanel panelPrincipale;
    private JPanel consultationPane;
    private JPanel mesobjetsPane;

    public Interface_ObjetVoler(){
        add(panelPrincipale);
        setLayout(new GridLayout());

    }
}
