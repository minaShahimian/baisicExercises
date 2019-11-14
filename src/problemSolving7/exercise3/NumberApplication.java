package problemSolving7.exercise3;

import java.util.List;
import java.util.Optional;

public class NumberApplication {
    public static void main(String[] args) {

        List<Integer> numbers = getNumbers();
        System.out.println("values: " + numbers);

        Jugde jugde = new Jugde();
        Optional<Integer> biggest = jugde.findBiggest(numbers);
        System.out.println("Biggest values is: " + biggest);

        Optional<Integer> smallest = jugde.findSmallest(numbers);
        System.out.println("Smallest values is: " + smallest);

    }

    private static List<Integer> getNumbers() {
        NumberGetter numberGetter = new NumberGetter();
        return numberGetter.getValues();
    }


}
