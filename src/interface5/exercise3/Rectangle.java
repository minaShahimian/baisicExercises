package interface5.exercise3;

import interface5.exercise1.Shape;

public class Rectangle implements Colored, Shape {

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public String toString() {
        return getName() + " " + getColor();
    }

}
