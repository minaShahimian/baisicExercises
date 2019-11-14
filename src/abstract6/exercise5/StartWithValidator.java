package abstract6.exercise5;

import java.util.List;

public class StartWithValidator extends Validator {


    public StartWithValidator(List<String> possibilities) {
        super(possibilities);
    }


    @Override
    public boolean isValid(String cardNumber) {
        List<String> beginnings = getPossibilities();
        for (String beginning : beginnings) {
            if (cardNumber.startsWith(beginning)) {
                return true;
            }
        }

        return false;
    }
}
