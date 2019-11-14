package exercises.number19;

import javax.swing.*;
import java.awt.*;

public class myPanle extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);

        int xc = 200;
        int yc = 350;
        int r = 30;
        int d = 20;

        Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.getColor("", Color.CYAN), Color.white};

        for (int i = 0; i < colors.length; i++) {

            int j = colors.length - i - 1;
            FillArc(g, xc, yc, r + j * d, colors[i]);
        }
    }

    private void FillArc(Graphics g, int xc, int yc, int r, Color color) {

        g.setColor(color);
        g.fillArc(xc - r, yc - r, 2 * r, 2 * r, 0, 180);
    }


}
