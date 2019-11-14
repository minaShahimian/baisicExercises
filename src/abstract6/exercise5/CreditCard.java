package abstract6.exercise5;

import javax.xml.validation.Validator;
import java.util.List;

public abstract class CreditCard {

    private List<Validator> validators;

    public CreditCard(List<Validator> validators) {
        this.validators = validators;
    }

    public abstract String getName();

    public boolean isValid(String cardNumber){
        for (Validator validator: validators){
            if (!validator.equals(cardNumber)){
                return false;
            }
        }return true;
    }
}
