package exercises.number6;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        float x;
        String ans;
        while (true) {

            System.out.format("enter a number:");
            Scanner input = new Scanner(System.in);
            x = input.nextFloat();
            System.out.format("%f\t%f\t%f\t\n", x, Math.pow(x, 2), Math.pow(x, 3));
            System.out.println("Do you want continue [yes,No]?");
            ans = input.next().toLowerCase();
            if (!(ans.startsWith("y"))) break;


        }

    }
}
