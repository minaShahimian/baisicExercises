package abstract6.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    private static List<CoffeeMaker> makers = Arrays.asList(
            new AutoDrip(), new FrenchPress(), new AutomaticCoffeeMachine()
    );

    public static List<CoffeeMaker> asList() {
        return makers;
    }

    public static Optional<CoffeeMaker> getName(String name) {
        for (CoffeeMaker maker : makers) {
            if (maker.getName().equalsIgnoreCase(name)) {
                return Optional.of(maker);
            }
        }
        return Optional.empty();
    }
}

