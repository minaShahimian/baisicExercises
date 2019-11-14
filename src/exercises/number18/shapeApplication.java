package exercises.number18;


public class shapeApplication {
    public static void main(String[] args) {
        shape shape = new shape("white", true, 20, 10, 11);
        shape.setColor("Black");
        shape.setHeight(100);
        shape.setWidth(15);
        shape.setRadius(2);

        Circle1 circle1 = new Circle1();

        double area = circle1.circleArea(shape.getRadius());
        double perimeter = circle1.circlePerimeter(shape.getRadius());
        shape.setFilled(false);

        Rectangle rectangle = new Rectangle();
        double rectArea = rectangle.rectangleArea(shape.getWidth(), shape.getHeight());

        System.out.println("the shape is : " + shape);
        System.out.println("The circle  has area: " + area + "and perimeter: " + perimeter + "The rechtangle area is : " + rectArea);

    }
}
