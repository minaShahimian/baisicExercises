package abstract6.exercise4;

public class MoneyApplication {
    public static void main(String[] args) {



        GreedyAlgorithm algorithm = new GreedyAlgorithm();
        algorithm.change(4);
        System.out.println("Money: "+algorithm.change(2));
    }
}
