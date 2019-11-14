package exercises.number13;

import javax.swing.*;

public class JOptionPane2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String message=String.format("Hi "+name+" ! \n Welcome to Java Source.");
        JOptionPane.showMessageDialog(null,message);

    }
}


