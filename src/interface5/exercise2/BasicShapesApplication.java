package interface5.exercise2;

import interface5.exercise1.Circle;
import interface5.exercise1.Shape;

import java.util.ArrayList;

public class BasicShapesApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Shape: " + circle);

        Square square = new Square();
        System.out.println("Shape: " + square);

        Triangle triangle = new Triangle();
        System.out.println("shape: " + triangle);

        // List<Circle> circles= (List<Circle>) Arrays.asList(
        //       new Circle(),new Triangle(),new Square());

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        System.out.println("Shapes: " + shapes);

        for (Shape shape : shapes) {
            String name = shape.getName();
            System.out.println("shape name: " + name);

        }
    }

}

