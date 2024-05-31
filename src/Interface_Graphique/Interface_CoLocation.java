package Interface_Graphique;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Interface_CoLocation extends JPanel {
    private JTabbedPane tabbedPane;
    private JPanel panelPrincipale;
    private JPanel accueilPanel;
    private JPanel mesPublicationsPanel;
    private JPanel panelTitre;
    private JPanel panelBouton;
    private JPanel panelBody;
    private JPanel panelFormulaire;
    private JTabbedPane tabbedPane1;
    private JComboBox comboBox1;
    private JTextArea photo1TextArea;
    private JTextArea photo2TextArea;
    private JTextArea photo3TextArea;
    private JTextField textField1;
    private JTextArea decrivezVotreImmobilierIciTextArea;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JComboBox comboBox2;
    private JTextField textField6;
    private JTextArea photo1TextArea1;
    private JTextArea photo2TextArea1;
    private JTextArea photo3TextArea1;
    private JTextPane decrivezVotreVenteIciTextPane;
    private JTextField textField7;
    private JTable table1;
    private JTable table2;
    private JTextField textField8;
    private JButton rechercherButton;
    private JCheckBox mobilierCheckBox;
    private JCheckBox residenceCheckBox;
    private JRadioButton aVendreRadioButton;
    private JRadioButton aLouerRadioButton;
    private JTextField textField2;
    private JButton annulerButton;
    private JButton confimerButton;

    String[] CAS = {"type", "localisation","", "contact","description","prix","nom"};
    DefaultTableModel model = new DefaultTableModel(null, CAS);

    public Interface_CoLocation(){
    add(panelPrincipale);
    setLayout(new GridLayout());
    table1.setModel(model);
    table1.getTableHeader().setVisible(true);

}




}
