package problemSolving7.exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RubbishRemover {
    private List<String> rubbish = Arrays.asList("", ",", ".", "?", "!");

    public List<String> removerRubbish(List<String> symbols) {
        List<String> cleanStrings = new ArrayList<>();
        for (String symbol : symbols) {
            if (!rubbish.contains(symbol)) {
                cleanStrings.add(symbol);
            }
        }
        return cleanStrings;
    }
}
