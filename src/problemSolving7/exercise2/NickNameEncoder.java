package problemSolving7.exercise2;

import java.util.ArrayList;
import java.util.List;

public class NickNameEncoder {

    public List<String> encod(List<String> words) {
        List<String> nickNames = new ArrayList<>();
        for (String word : words) {
            int lenght = word.length();
            if (lenght < 2) {
                nickNames.add(word);
            } else {
                String nickName = word.substring(0, lenght / 2);
                nickNames.add(nickName);
            }

        }
        return nickNames;
    }

}
