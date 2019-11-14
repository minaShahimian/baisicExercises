package problemSolving7.exercise5;

public class PalindromeApplication {
    public static void main(String[] args) {
        StringGetter stringGetter = new StringGetter();
        String input = stringGetter.getString();

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println( palindromeChecker.isPalindrom(input));

    }
}
