package TelasPizzaria;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FormaPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.drawLine(50, 350, 250, 350);
    }
}
