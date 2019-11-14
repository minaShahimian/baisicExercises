package listSetsMapsOptionals4.exercise03;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {
    public static void main(String[] args) {

        Map<Integer, String> topics = new HashMap<>();

        Integer number01 = 1;
        Integer number02 = 2;
        Integer number03 = 3;

        String book01 = "roman";
        String book02 = "history";
        String book03 = "poetry";

        topics.put(number01, book01);
        topics.put(number02, book02);
        topics.put(number03, book03);

        System.out.println("Index: " + topics);

        System.out.println("The key are:"+topics.keySet());
        System.out.println("The value are:"+topics.values());

        topics.entrySet();
        System.out.println("Index entry sets: " + topics);

        String book04 = "mathematik";
        topics.put(number01, book04);
        System.out.println("Index: " + topics);

        System.out.println("The page number " + number01 + " exists as key.");
        System.out.println("The topic in page number " + number03 + " is " + book03);

        int size = topics.size();
        System.out.println("Index size: " + size);


    }

}
