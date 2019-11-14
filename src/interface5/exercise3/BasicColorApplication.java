package interface5.exercise3;

import interface5.exercise1.Shape;

import java.util.Arrays;
import java.util.List;

public class BasicColorApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        String color = rectangle.getColor();
        String name = rectangle.getName();
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);

        Colored colored = (Colored) rectangle;
        System.out.println("colored: "+colored.getColor());

        Shape shape=(Shape)rectangle;
        System.out.println("Shape: "+shape.getName());

        List<Rectangle> rectangles = Arrays.asList(rectangle);
        List<Colored> coloreds = Arrays.asList(rectangle,colored);
        List<Shape> shapes = Arrays.asList(rectangle, shape);

        System.out.println(rectangles);
        System.out.println(coloreds);
        System.out.println(shapes);


    }
}
