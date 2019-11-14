package listSetsMapsOptionals4.exercise04;

import java.util.Optional;

public class BasicGiftApplication {
    public static void main(String[] args) {

        Optional<String> giftBox01 = Optional.empty();
        System.out.println("Gift: " + giftBox01);

        Optional<String> giftBox02 = Optional.of("Robotory");
        System.out.println("Gift: " + giftBox02);

        if (giftBox02.isPresent()) {
            System.out.println("There is a present in the gift box");
        } else {
            System.out.println("There is not a present in the gift box.");
        }

        System.out.println("The gift is a " + giftBox02.get());


    }
}
