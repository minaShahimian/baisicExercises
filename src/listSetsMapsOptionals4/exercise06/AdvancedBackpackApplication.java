package listSetsMapsOptionals4.exercise06;

import java.util.HashSet;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {

        HashSet<Item> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);

        Item toothpaste = new Item("toothpaste");
        Item towel = new Item("towel");
        Item underwear = new Item("underwear");

        backpack.add(toothpaste);
        backpack.add(towel);
        backpack.add(underwear);
        System.out.println("Backpack: " + backpack);

        Item toothpaste1 = new Item("toothpaste");
        backpack.add(toothpaste1);
        if (toothpaste.equals(toothpaste1)) {
            System.out.println("The backpack contains toothpaste.  ");
        }

        backpack.remove(toothpaste);
        System.out.println("Backpack: " + backpack);
        if (backpack.contains(toothpaste)) {
            System.out.println("The backpack contains toothpaste.");

        } else {
            System.out.println("The backpack no longer contains toothpaste.");
        }
        System.out.println("Backpack: " + backpack);
        backpack.add(towel);
        System.out.println("Backpack: " + backpack);

        int size = backpack.size();
        System.out.println("Backpack: " + size);
    }
}
