package Interface_Graphique;

import javax.swing.*;
import java.awt.*;

public class Interface_CoLocation extends JPanel {
    private JTabbedPane tabbedPane;
    private JPanel panelPrincipale;
    private JPanel accueilPanel;
    private JPanel mesPublicationsPanel;

    public Interface_CoLocation(){
    add(panelPrincipale);
    setLayout(new GridLayout());
}


}
