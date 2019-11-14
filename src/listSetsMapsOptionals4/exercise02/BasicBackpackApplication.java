package listSetsMapsOptionals4.exercise02;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {
    public static void main(String[] args) {

        Set<String> backpack = new HashSet<>();
        backpack.isEmpty();
        System.out.println("backpack: " + backpack);

        String item01 = "toothpaste";
        String item02 = "towel";
        String item03 = "underwear";

        backpack.add(item01);
        backpack.add(item02);
        backpack.add(item03);
        System.out.println("backpack:" + backpack);
        boolean contains = backpack.contains(item03);
        System.out.println("The backpack contains " + item03 + " is " + contains);

        backpack.remove("underwear");
        System.out.println("backpack: " + backpack);

        System.out.println("The backpack no longer contains underwear.");
        System.out.println("backpack:" + backpack);
        boolean contains2 = backpack.contains(item02);
        System.out.println("backpack:" + contains2);

        backpack.add(item01);

       int size = backpack.size();
        System.out.println("backpack size :" + size);

    }
}
