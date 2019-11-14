package lambdas8.exercise3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KeywordFinder {


    List<String> findElegant(String sentence) {
        return filter(sentence, word -> word.startsWith("ele"));
    }

    List<String> findPlayFul(String sentence) {
        return filter(sentence, word -> word.endsWith("ful"));
    }

    private List<String> filter(String sentence, Predicate<String> condition) {

        String[] split = sentence.split("  ");
        List<String> words = new ArrayList<>(Arrays.asList(split));
        List<String> filtered = new ArrayList<>();
        for (String word : words) {
            if (condition.test(word)) {
                filtered.add(word);
            }
        }
        return filtered;
    }

    private List<String> filter1(String sentence, Predicate<String> condition) {
        List<String> filtered = new ArrayList<>();
        for (String word : Arrays.asList(sentence.split(" "))) {
            if (condition.test(word)) {
                filtered.add(word);
            }
        }
        return filtered;
    }

    private List<String> filter2(String sentence, Predicate<String> condition) {
        List<String> rightWords = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        rightWords.removeIf(word -> condition.negate().test(word));
        return rightWords;
    }

    private List<String> filter3(String sentence, Predicate<String> condition) {
        return Stream.of(sentence.split(" "))
                .filter(condition)
                .collect(Collectors.toList());
    }


}