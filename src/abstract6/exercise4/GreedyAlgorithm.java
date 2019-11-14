package abstract6.exercise4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreedyAlgorithm {
    private List<Money> getMoneys() {
        return new ArrayList<>(Arrays.asList(
                new Cent50(), new Cent20(), new Cent10(),
                new Cent5(), new Cent2(), new Cent1()
        ));
    }

    public List<Money> change(Integer amound) {
        List<Money> change = new ArrayList<>();
        List<Money> moneys = getMoneys();

        while (amound > 0.0) {
            Money money = moneys.get(0);

            if (money.isApplicable(amound)) {
                change.add(money);
                amound -= money.getAmount();
            } else {
                Collections.rotate(moneys, 5);
            }
        }
        return change;
    }


}
