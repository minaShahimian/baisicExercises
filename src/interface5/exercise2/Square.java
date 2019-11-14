package interface5.exercise2;

import interface5.exercise1.Shape;

public class Square implements Shape {
    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public String toString() {
        return getName();
    }
}
