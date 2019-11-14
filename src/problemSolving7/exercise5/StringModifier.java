package problemSolving7.exercise5;

import java.util.Arrays;
import java.util.List;

public class StringModifier {

    public List<String> breakIntoCleanSymbols(String string) {

        String[] brokenArray = string.split("");
        List<String> splitWithRubbish = Arrays.asList(brokenArray);

        RubbishRemover rubbishRemover = new RubbishRemover();
        return rubbishRemover.removerRubbish(splitWithRubbish);

    }
}
