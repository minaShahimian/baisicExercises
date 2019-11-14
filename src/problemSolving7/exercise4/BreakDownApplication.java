package problemSolving7.exercise4;

import java.util.List;

public class BreakDownApplication {
    public static void main(String[] args) {
        NumberGetter numberGetter = new NumberGetter();
        Integer integer = numberGetter.getPositiveInteger();

        NumberManipulator numberManipulator = new NumberManipulator();
        // List<Integer> list = numberManipulator.breakToDigits(integer);
        List<Integer> list = numberManipulator.breakToDigitsViaString(integer);

        System.out.println("The collection is: " + list);
    }

}
