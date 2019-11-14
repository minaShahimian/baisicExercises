package traits3.Reflektion1;

public class NumberMirror {
    private Integer number;

    public NumberMirror(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Number mirror(Number number) {

        long longValue = number.longValue();
        return longValue;
    }
}
