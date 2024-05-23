import Interface_Graphique.Login;
import Interface_Graphique.Page_Principale;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Page_Principale application=new Page_Principale();
        application.setContentPane(application.panelMain);
        application.setTitle(" GoFind ");
        application.setSize(1500,850);
        application.setVisible(true);
        application.setResizable(true);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}