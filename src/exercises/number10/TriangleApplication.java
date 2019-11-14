package exercises.number10;

public class TriangleApplication {

    public static void main(String[] args) {

        System.out.println("Triangle T1:");
        triangle t1=new triangle(12,44);

        t1.printInf();
        System.out.println("______________________");

        System.out.println("Triangle T2:");
        triangle t2=new triangle(33,14);

        t2.printInf();
        System.out.println("______________________");

        System.out.println("Triangle T3:");
        triangle t3=new triangle(2,14);

        t3.printInf();
        System.out.println("______________________");

    }
}
