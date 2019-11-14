package listSetsMapsOptionals4.exercise01;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);

        String list1 = "oranges";
        String list2 = "tomatoes";
        String list3 = "Bananas";

        groceries.add(list1);
        groceries.add(list2);
        groceries.add(list3);
        System.out.println("Groceries: " + groceries);

        groceries.remove(list3);
        System.out.println("Groceries: " + groceries);

        groceries.add(list2);
        System.out.println("Groceries: " + groceries);

        groceries.add(3, "bananes");
        System.out.println("Groceries: " + groceries);

        int size = groceries.size();
        System.out.println("Groceries size: " + size);

        boolean empty = groceries.isEmpty();
        System.out.println("Groceries empty is : "+empty);

    }
}
