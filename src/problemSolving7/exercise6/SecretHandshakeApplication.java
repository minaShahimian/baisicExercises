package problemSolving7.exercise6;

import java.util.List;

public class SecretHandshakeApplication {
    public static void main(String[] args) {
        SecretHandshakeMovesTranslator secretHandshakeMovesTranslator =
                new SecretHandshakeMovesTranslator();
        List<String> translate = secretHandshakeMovesTranslator.translate(9562);
        System.out.println(translate);


    }
}
