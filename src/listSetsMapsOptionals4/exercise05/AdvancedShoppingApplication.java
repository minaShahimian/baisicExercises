package listSetsMapsOptionals4.exercise05;

import java.util.ArrayList;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        ArrayList<Grocery> groceries = new ArrayList<>();
        System.out.println("groceries: " + groceries);

        Grocery bananas = new Grocery("Bananas");
        Grocery oranges = new Grocery("Oranges");
        Grocery tomatoes = new Grocery("Tomatoes");
        groceries.add(bananas);
        groceries.add(oranges);
        groceries.add(tomatoes);
        System.out.println("Grocery : "+groceries);
        Grocery tomatoes1 = new Grocery("Tomatoes");

        groceries.remove(oranges);
        System.out.println("Groseries: "+groceries);

        groceries.add(tomatoes1);
        System.out.println("Grocery : "+groceries);

        groceries.add(tomatoes1);
        System.out.println("Grocery : "+groceries);

        groceries.remove(tomatoes1);
        System.out.println("Groseries :"+groceries);


    }
}
