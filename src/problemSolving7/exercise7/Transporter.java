package problemSolving7.exercise7;

public class Transporter {
    public Boolean canTransport(Integer numOneSeates, Integer numFiveSeates, Integer numPassengers) {

        Integer passengersWithoutCar = numPassengers - (numFiveSeates * 5 + numOneSeates);

      return passengersWithoutCar<=0 ;
}
}
