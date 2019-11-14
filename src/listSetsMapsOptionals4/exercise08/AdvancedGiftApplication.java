package listSetsMapsOptionals4.exercise08;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {

        Optional<Object> giftBox = Optional.empty();
        System.out.println("Gift: " + giftBox);

       // Box robotoy = new Box("Robotoy");

        Optional<String> content = Optional.of("robotoy");
        System.out.println("Gift: " + content);

        if (content.isPresent()) {
            System.out.println("There is a present in the gift box. ");
        }
        Object value = content.get();
        System.out.println("The gift is a content= "+value);
    }
}
