package problemSolving7.exercise2;

import java.util.List;

public class NickNameApplication {
    public static void main(String[] args) {
        List<String> words = getWords();
        System.out.println(words);

        List<String> nickNames = encode(words);
        System.out.println(nickNames);

    }

    private static List<String> getWords() {
        WordCollector wordCollector = new WordCollector();
        return wordCollector.getWords();

    }

    private static List<String> encode(List<String> words) {
        NickNameEncoder nickNameEncoder = new NickNameEncoder();
        return nickNameEncoder.encod(words);
    }

}
