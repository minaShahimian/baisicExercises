package traits3.Reflektion1;

public class NumberMirrorApplication {
    public static void main(String[] args) {
        NumberMirror numberMirror = new NumberMirror(456);
        numberMirror.getNumber();

        Number mirror = numberMirror.mirror(6543);
        System.out.println("The number is :" + mirror);
    }

}
