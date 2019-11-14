package exercises.number20;

import javax.swing.*;
import java.awt.*;

public class IconAndLabel {
    public static void main(String[] args) {
        JFrame app = new JFrame("Label and Icon.");
        app.setSize(500, 500);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbl1 = new JLabel();
        lbl1.setText("Welcome to Java.");
        app.add(lbl1, BorderLayout.NORTH);

        JLabel lbl2 = new JLabel(" Text with Photo:");
        app.add(lbl2, BorderLayout.CENTER);

       // ImageIcon img;
        //img = new ImageIcon(app.getClass().getResource("/image/java.png"));
       // JLabel lbl3 = new JLabel(img);
       // app.add(lbl3);

        app.setVisible(true);
    }
}
