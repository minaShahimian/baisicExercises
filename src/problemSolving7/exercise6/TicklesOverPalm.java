package problemSolving7.exercise6;

public class TicklesOverPalm implements Handshake {
    @Override
    public String getName() {
        return "Tickles over palm";
    }

    @Override
    public Boolean isSuitable(String value) {
        return value.equals("5");
    }
}
