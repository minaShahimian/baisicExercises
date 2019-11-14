package exercises.number0;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter first Digit!");
        int first = scanner.nextInt();
        System.out.println("please Enter second Digit!");
        int second = scanner.nextInt();
        int result = first + second;

        System.out.println("The result of summation is " + result);
    }
}
