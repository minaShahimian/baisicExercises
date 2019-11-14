package problemSolving7.exercise4;

import java.util.ArrayList;
import java.util.List;

public class NumberManipulator {
    protected List<Integer> breakToDigits(Integer number) {
        List<Integer> digits = new ArrayList<>();

        while (number > 9) {
            Integer unit = number % 10;
            digits.add(unit);
            number /= 10;
        }
        digits.add(number);
       // Collections.reverse(digits); or public;
        return digits;
    }

    public List<Integer> breakToDigitsViaString(Integer integer) {
        String string = String.valueOf(integer);
        String[] temp = string.split("");
        List<Integer> digits = new ArrayList<>();
        for (String s : temp) {
            digits.add(Integer.valueOf(s));
        }
        return digits;
    }
}
