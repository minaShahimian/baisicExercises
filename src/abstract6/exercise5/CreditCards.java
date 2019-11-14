package abstract6.exercise5;/*package week6.exercise5;

import week2.exercise05.Magazine;

import java.util.Arrays;
import java.util.List;

public class CreditCards {
    private static List<CreditCard> creditCards = Arrays.asList(
            new AmericanExpress(), new Visa(), new MasterCard()
    );

    public static String getCreditCards(String cardNumber) {
        for (CreditCard creditCard : creditCards) {
            if (creditCard.isValid(cardNumber)) {
                return creditCard.getName();
            }
        }
        return "INVALID";
    }
}
*/