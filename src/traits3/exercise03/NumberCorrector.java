package traits3.exercise03;

//import week3.Customer;

public class NumberCorrector {
    public Integer Corector(Double number) {
        number = Math.floor(number);
        number = Math.abs(number);
        int correctNr = number.intValue();
        return correctNr;


    }
}
