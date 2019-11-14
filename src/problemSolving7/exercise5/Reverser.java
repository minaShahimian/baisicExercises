package problemSolving7.exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverser {

    public List<String> reverse(List<String> original) {
        List<String> copy = new ArrayList<>(original);
        Collections.reverse(copy);
        return copy;
    }
}
