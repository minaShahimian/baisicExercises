package exercises.number4;

import java.util.Scanner;

public class floatNumber {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the float number:");

        double x=input.nextFloat();

        int  counter=0;

        while (x>1 && counter<4){
            System.out.format("%f \n",x);
            x /=2;
            counter++;


        }

    }
}

