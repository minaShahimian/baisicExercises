package problemSolving7.exercise6;

public class ThumbTouchesBack implements Handshake {
    @Override
    public String getName() {
        return "Thumb Touches Back";
    }

    @Override
    public Boolean isSuitable(String value) {
        return value.equals("2");
    }
}
