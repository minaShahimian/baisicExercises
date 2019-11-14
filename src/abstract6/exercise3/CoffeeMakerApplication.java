package abstract6.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {

    public static void main(String[] args) {
        List<CoffeeMaker> makers = CoffeeMakers.asList();
        for (CoffeeMaker maker : makers) {
            Coffee coffee = maker.brew();
            display(coffee);
        }
        List<String> names = Arrays.asList("Automatic coffee machine",
                "French press","Auto dri");
        for (String name : names) {
            displayBrewedCoffeeWithCoffeeMaker(name);
        }

        String name = "Moka pot";
        Optional<CoffeeMaker> maker = CoffeeMakers.getName(name);
        if (!maker.isPresent()) {
            System.out.println("The Coffee maker with the name " + name + " is not available.");
        }

    }

    private static void displayBrewedCoffeeWithCoffeeMaker(String name) {
        Optional<CoffeeMaker> maker = CoffeeMakers.getName(name);
        if (maker.isPresent()) {
            Coffee coffee = maker.get().brew();
            display(coffee);
        }
    }

    private static void display(Coffee coffee) {
        System.out.println(coffee.getMadeBy() + " Brawed a coffee and it took  " + coffee.getBrewedTime() + " minutes.");
    }
}
