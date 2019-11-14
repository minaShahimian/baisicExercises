package problemSolving7.exercise4;

import java.util.Scanner;

public class NumberGetter {
    protected Integer getPositiveInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter the positive integer: ");
        return scanner.nextInt();
    }
}
