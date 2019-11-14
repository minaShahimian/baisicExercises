package co_creation2.exercise04;

public class CarShopApplication {
    public static void main(String[] args) {

        Car bmw = new Car("BMW");
        Car benz = new Car("Benz");
        Car aud = new Car("Aud");

        Seller seller = new Seller();
        seller.describe(benz);
        seller.describe(bmw);
        seller.describe(aud);

        System.out.println("that the three of them are particularly good");

    }


}
