package abstract6.exercise5;

import javax.xml.validation.Validator;
import java.util.List;

public class Visa extends CreditCard {
    public Visa(List<Validator> validators) {
        super(validators);
    }

    @Override
    public String getName() {
        return "Visa";
    }
}
