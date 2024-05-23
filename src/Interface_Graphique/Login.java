package Interface_Graphique;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    public JPanel panelMain;
    private JPanel panelGauche;
    private JPanel panelDroite;

    private Graphics graphics;

    public Login(){

        panelGauche.paint(graphics);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D=(Graphics2D) g;
        GradientPaint gradientPaint=new GradientPaint(0,0,Color.blue,0,getHeight(),Color.CYAN);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillRect(0,0,getWidth(),getHeight());
    }
}
