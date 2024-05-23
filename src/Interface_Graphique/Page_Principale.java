package Interface_Graphique;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Page_Principale extends JFrame {
    public JPanel panelMain;
    private JButton objetElectroniqueButton;
    private JButton coLocationButton;
    private JButton coVoiturageButton;
    private JTabbedPane tabbedPane1;


    public Page_Principale() {
        Interface_ObjetVoler objetVoler = new Interface_ObjetVoler();
        Interface_CoVoiturage voiturage = new Interface_CoVoiturage();
        Interface_CoLocation coLocation = new Interface_CoLocation();

        tabbedPane1.addTab("1", objetVoler);
        tabbedPane1.addTab("2", voiturage);
        tabbedPane1.addTab("3", coLocation);
        objetElectroniqueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(0);
            }
        });
        coVoiturageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(1);
            }
        });
        coLocationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(2);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
