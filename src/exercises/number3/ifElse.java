package exercises.number3;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter the number:");
        int n = input.nextInt();

        String day;
        if (n == 1) {
            day = "Sunday";

        } else if (n == 2) {
            day = "Monday";

        } else if (n == 3) {
            day = "Tuesday";

        } else if (n == 4) {
            day = "wednesday";

        } else if (n == 5) {
            day = "Thursday";

        } else if (n == 6) {
            day = "Friday";

        } else if (n == 7) {
            day = "Saturday";
        }
             else{
                day = "";

            }
            if (day != "") {
                System.out.format("The day #%d in week is: %s.", n, day);
            } else {
                System.out.println("you have entered an invalid number.");
            }


        }

    }
