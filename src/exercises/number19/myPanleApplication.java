package exercises.number19;

import javax.swing.*;

public class myPanleApplication {
    public static void main(String[] args) {
        myPanle panel = new myPanle();
        JFrame jFrame = new JFrame("Drawing My Panle");

        jFrame.setSize(400, 400);
        jFrame.add(panel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }
}
