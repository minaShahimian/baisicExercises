package abstract6.exercise2;

public class IceCreamApplication {
    public static void main(String[] args) {
        ConeIceCream cone = new ConeIceCream("chocolate", "oreo");
        String response1 = cone.eat();
        System.out.println(response1);

        CupIceCream cup = new CupIceCream("Vanilla", "cookies");
        String response2 = cup.eat();
        System.out.println(response2);

    }
}
