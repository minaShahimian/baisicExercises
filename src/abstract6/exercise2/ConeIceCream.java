package abstract6.exercise2;

public class ConeIceCream extends IceCream {

    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "The " + getFlavor() + " ice_cream with " + getTopping() + " is licked.";

    }


}
