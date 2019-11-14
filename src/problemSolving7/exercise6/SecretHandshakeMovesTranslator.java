package problemSolving7.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecretHandshakeMovesTranslator {
    private Scanner scanner = new Scanner(System.in);

    protected List<String> translate(Integer code) {


        List<String> digitValues = getDigitValues(code);
        List<String> correctHandshakeNames = new ArrayList<>();
        for (String digit : digitValues) {
            for (Handshake handshake : Handshakes.getList()) {
                if (handshake.isSuitable(digit)) {
                    correctHandshakeNames.add(handshake.getName());
                }
            }
        }
        System.out.println("The code is: ");
        scanner.nextLine();
        return correctHandshakeNames;
    }

    private List<String> getDigitValues(Integer code) {
        String[] splitDigit = code.toString().split("");
        return Arrays.asList(splitDigit);
    }


}
