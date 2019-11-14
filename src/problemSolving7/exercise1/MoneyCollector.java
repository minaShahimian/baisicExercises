package problemSolving7.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MoneyCollector {
    private Random random = new Random();


    protected List<List<Integer>> getMoneyList() {
        List<List<Integer>> moneyPaid = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer value = getMoneyPaid();
            moneyPaid.add(Collections.singletonList(value));
        }
        return moneyPaid;
    }

    private Integer getMoneyPaid() {
        return random.nextInt(5) + 1;
    }


}
