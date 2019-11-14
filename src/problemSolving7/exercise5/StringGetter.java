package problemSolving7.exercise5;

import java.util.Scanner;

public class StringGetter {
    public String getString() {
        System.out.println("Please write a string you want to test for palindrominess xD");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
