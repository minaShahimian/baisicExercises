package problemSolving7.exercise3;

import java.util.List;
import java.util.Optional;

public class Jugde {

    protected Optional<Integer> findBiggest(List<Integer> values) {
        if (values.isEmpty()) {
            return Optional.empty();
        }
        Integer biggest = values.get(0);
        for (Integer value : values) {
            if (value > biggest) {
                biggest = value;

            }
        }
        return Optional.of(biggest);
    }

    protected Optional<Integer> findSmallest(List<Integer> values) {
        if (values.isEmpty()) {
            return Optional.empty();
        }
        Integer smallest = values.get(0);
        for (Integer value : values) {
            if (value<smallest) {
               smallest=value;
            }
        }return Optional.of(smallest);
    }



}
