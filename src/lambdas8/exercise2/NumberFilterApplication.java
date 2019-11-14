package lambdas8.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberFilterApplication {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        NumberFilter numberFilter = new NumberFilter();
        List<Integer> odd = numberFilter.getOdd(numbers);
        System.out.println("The odd number is: " + odd);
        List<Integer> even = numberFilter.getEven(numbers);
        System.out.println("The even number is: " + even);
    }
}
