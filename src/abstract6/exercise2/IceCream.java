package abstract6.exercise2;

public abstract class IceCream {

    private String flavor;
    private String topping;

    protected IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getTopping() {
        return topping;
    }

    public abstract String eat();
}
