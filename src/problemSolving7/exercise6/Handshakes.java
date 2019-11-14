package problemSolving7.exercise6;

import java.util.Arrays;
import java.util.List;

public class Handshakes {
    private static List<Handshake> handshakes = Arrays.asList(
            new BroKnock(), new ThousandKnuckles(),
            new ThumbTouchesBack(), new TicklesOverPalm());


    public static List<Handshake> getList() {
        return handshakes;
    }
}
