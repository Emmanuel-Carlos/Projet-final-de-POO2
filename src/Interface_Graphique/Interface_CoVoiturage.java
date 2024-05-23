package Interface_Graphique;

import javax.swing.*;
import java.awt.*;

public class Interface_CoVoiturage extends JPanel {
    private JTabbedPane tabbedPane;
    private JPanel panelPrincipale;
    private JPanel accueilPane;
    private JPanel mesPublicationsPane;

    public Interface_CoVoiturage(){
        add(panelPrincipale);
        setLayout(new GridLayout());
    }
}
