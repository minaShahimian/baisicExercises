package exercises.number14;

import javax.swing.*;


public class JOptionPane3 {
    public static void main(String[] args) {
        String ans=JOptionPane.showInputDialog("pleas inter the integer:");
        int n=Integer.parseInt(ans);
        String message;
        if (n%2==0){
            message=("The number is even.");

        }else {
            message=("The number is add.");
        }

        JOptionPane.showMessageDialog(null,message);
    }
}
