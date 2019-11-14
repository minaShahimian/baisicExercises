package interface5.exercise2;

import interface5.exercise1.Shape;

public class Triangle implements Shape {
    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
