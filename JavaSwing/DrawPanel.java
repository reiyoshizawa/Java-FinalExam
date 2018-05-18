package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paintComponents(Graphics g) {
        // call paintComponent to ensure the panel display correctly
        super.paintComponents(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);

    }
}
