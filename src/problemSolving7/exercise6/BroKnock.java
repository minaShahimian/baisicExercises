package problemSolving7.exercise6;

public class BroKnock implements Handshake {
    @Override
    public String getName() {
        return "Bro knock";
    }

    @Override
    public Boolean isSuitable(String value) {
        return value.equals("6");
    }
}
