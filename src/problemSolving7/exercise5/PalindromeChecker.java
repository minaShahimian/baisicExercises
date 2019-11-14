package problemSolving7.exercise5;

import java.util.List;

public class PalindromeChecker {
    protected boolean isPalindrom(String string) {
        StringModifier stringModifier = new StringModifier();
        List<String> brokenAndClean = stringModifier.breakIntoCleanSymbols(string);

        Reverser reverser = new Reverser();
        List<String> reversed = reverser.reverse(brokenAndClean);

        return brokenAndClean.equals(reversed);


    }
}
