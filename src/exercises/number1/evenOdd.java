package exercises.number1;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer\n");
        int n = input.nextInt();

        if (n == 5) {
            System.out.println("You have entered 5! ");


        } else {
            System.out.println("You have not entered 5! ");


        }

        if (n % 2==0){

            System.out.println("The number is even!");

        } else {
            System.out.println("The number is not even!");

        }

        String type=(n% 2==0)? "even":"odd";

        System.out.format("The number %d is an %s number.",n,type);

        int counter = 0;
        int counter_max = 3;
        while ((n >= 1) & (counter < counter_max)){
            System.out.format("%f\n", n);
            n /= 2;
            counter++;

        }


    }
}
