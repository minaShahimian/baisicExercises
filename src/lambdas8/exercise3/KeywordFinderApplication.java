package lambdas8.exercise3;

import java.util.List;

public class KeywordFinderApplication {
    public static void main(String[] args) {
        KeywordFinder keywordFinder = new KeywordFinder();
         List<String> word1 = keywordFinder.findElegant(
                "The elephant is lifted eleven floors easily with the help of an electricity elevator ");
        List<String> word2 = keywordFinder.findPlayFul(
                "The rightful heir of the powerful king had on awful accident playing with a colorful bear");

        System.out.println(word1);
        System.out.println(word2);
    }
}
