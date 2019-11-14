package abstract6.exercise3;

public abstract class CoffeeMaker {

    protected abstract String getName();

    protected abstract Integer getBrewingTime();

    public Coffee brew(){
        String madeBy=getName();
        Integer brewedTime=getBrewingTime();
        return new Coffee(madeBy,brewedTime);
    }
}
