package abstract6.exercise5;

import java.util.List;

public abstract class Validator {

    private List<String> possibilities;

    public Validator(List<String> possibilities) {
        this.possibilities = possibilities;
    }

    protected List<String> getPossibilities() {
        return possibilities;
    }

    public abstract boolean isValid(String cardNumber);
}
