package co_creation2.Reflection1;

public class PostOfficeAssistant {
    public void stamp(Letter letter) {
        String address = letter.getAddress();
        Boolean stamped = letter.isStamped(letter);
        System.out.println(address);
        System.out.println(stamped);
    }

    public void send(Letter letter) {
        letter.getAddress();
        if (letter.isStamped(letter)) {
            System.out.println("they will send it to the address.");
        } else {
            System.out.println("they need to stamp it first.");
        }
        stamp(letter);
    }
}
