package problemSolving7.exercise6;

public class ThousandKnuckles implements Handshake {
    @Override
    public String getName() {
        return "Thousand Knuckles ";
    }

    @Override
    public Boolean isSuitable(String value) {
        return value.equals("9");
    }
}
