package problemSolving7.exercise1;

import java.util.List;

public class ApplicationMoney {
    public static void main(String[] args) {
        List<List<Integer>> moneyPaid = getList();
        System.out.println("Here is the list of payments: " + moneyPaid);
        calculatorTotal(moneyPaid);
    }
    private static List<List<Integer>> getList() {
        MoneyCollector moneyCollector = new MoneyCollector();
        return moneyCollector.getMoneyList();
    }
    private static void calculatorTotal(List<List<Integer>> moneyPaid) {
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Integer total=moneyCalculator.calculateTotal(moneyPaid);
        System.out.println("The total is: " + total);
    }
}
