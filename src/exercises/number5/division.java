package exercises.number5;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a flout number:");

        double n = input.nextFloat();
        int counter = 0;
        int counter_max = 3;
        while (  counter<counter_max) {
            System.out.format("%f\n",n);
            n /= 2;
            if (n > 1);
            counter++;

        }
    }
}