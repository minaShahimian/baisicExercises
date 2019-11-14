package problemSolving7.exercise7;

import java.util.Scanner;

public class Gatherer {

    private Scanner scanner = new Scanner(System.in);
    private Integer numOneSeates = getNumberOfOneSeates();
    private Integer numFiveSeatees = getNumberOfFiveSeates();
    private Integer numPassengers = getNumberOfPassengers();

    private Integer getNumberOfPassengers() {
        System.out.println("Please tell me the number of passengers!");
        return scanner.nextInt();
    }

    private Integer getNumberOfFiveSeates() {
        System.out.println("Please tell me the number of one_ Seates available! ");
        return scanner.nextInt();
    }

    private Integer getNumberOfOneSeates() {
        System.out.println("Please tell me the number of five_seates available!");
        return scanner.nextInt();
    }

    public boolean areThereEnoughSeates() {
        Transporter transporter = new Transporter();
        return transporter.canTransport(numOneSeates, numFiveSeatees, numPassengers);
    }
}
