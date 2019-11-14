package listSetsMapsOptionals4.exercise07;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AdvancedIndexApplication {
    public static void main(String[] args) {
        HashMap<Integer, List> index = new HashMap<>();
        System.out.println("Index: " + index);

        Topic connecting = new Topic("connecting");
        Topic possitive = new Topic("possitive things ");
        Topic economy = new Topic("ecologic economy");

        Integer number1 = 10;
        Integer number2 = 20;

        ArrayList<Topic> topic1 = new ArrayList<>();
        ArrayList<Topic> topic2 = new ArrayList<>();

        topic1.add(connecting);
        topic2.add(possitive);
        topic2.add(economy);

        index.put(number1, topic1);
        index.put(number2, topic2);

        System.out.println("Index: " + index);

        System.out.println("Index keys:" + index.keySet());
        System.out.println("Index values: " + index.values());

        System.out.println("Index entry sets:" + index.entrySet());

        Topic teaching = new Topic("teaching methods ");
        topic1.add(teaching);
        System.out.println("Index: " + index);

        List stored = index.get(topic1);
        index.put(number1,stored);
        System.out.println("stored is:"+ topic1);

        if ( index.containsKey(10)){
           System.out.println("The page number 10 exists as key.");
       }

        System.out.println("The topics in page number 20 are " + topic2);

        int size = index.size();
        System.out.println("Index size: " + size);
    }
}
