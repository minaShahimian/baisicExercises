package co_creation2.Reflection2;

import co_creation2.Reflection1.Letter;

import java.util.ArrayList;
import java.util.List;

public class Postman {
    private List<String> letter = new ArrayList<>();


    public void deliver(Letter letters) {
        letter.add(letters.getAddress());
        for (String letter: letter) {

            System.out.println("that he delivered it to its address");


        }

    }
}
