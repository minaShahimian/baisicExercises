package abstract6.exercise5;

public class MultiplyOperator implements Operator {
    @Override
    public Integer operator(Integer number) {
        number *= 2;
        if (number < 10) {
            return number;
        }
        Integer docents = number / 10;
        Integer units = number % 10;
        return docents + units;
    }
}
