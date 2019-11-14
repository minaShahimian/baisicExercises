package problemSolving7.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGetter {
    private List<Integer> values = generateValues();

    public List<Integer> getValues() {
        return values;
    }

    private List<Integer> generateValues() {
        List<Integer> values = new ArrayList<>();
        Random random = new Random();
        for (int time = 0; time < 10; time++) {
            Integer value = random.nextInt(100);
            values.add(value);
        }
        return values;
    }
}