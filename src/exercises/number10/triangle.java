package exercises.number10;

public class triangle {
    private double a;
    private double b;

    public triangle(double a1, double b1) {
        set_a(a1);
        set_b(b1);

    }

    public double get_a() {
        return a;
    }

    public void set_a(double value) {
        a = Math.abs(value);

    }

    public double get_b() {
        return b;
    }

    public void set_b(double value) {
        b = Math.abs(value);
    }


    public void printInf() {

        System.out.println("Triangle:\n");

        System.out.format("a=%f \n", a);
        System.out.format("b=%f,\n", b);
        System.out.format("c=%f\n", get_c());
        System.out.format("S=%f\n", (Area()));
        System.out.format("phi =%f\n", get_phi());

        System.out.format("Theta=%f\n", get_theta());
    }

    public double get_c() {
        double c = Math.sqrt(a * a + b * b);
        return c;

    }

    public double Area() {
        return (a * b) / 2;
    }

    public double get_theta() {
        return Math.atan2(b, a) * 180 / Math.PI;

    }

    public double get_phi() {
        return Math.atan2(a, b) * 180 / Math.PI;

    }
}

