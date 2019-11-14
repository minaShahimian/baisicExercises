package exercises.number8;

import java.util.Scanner;

public class division2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer:");
        int d = 0;

        int n = input.nextInt();
        System.out.format("\n Divisors of %d:\n", n);
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.format("%d\n", i);

                d++;
            }

            System.out.println("Do you want continue?\n");
            String ans=input.nextLine().toLowerCase();
            if (!(ans.startsWith("y"))) break;
        }

        System.out.format("\nNumber of divisors:%d\n", d);
        if (d%2==0) {
            System.out.format("The number %d is prime.\n", n);


        } else {
            System.out.format("The number %d is NOT prime.\n", n);


        }


    }
}