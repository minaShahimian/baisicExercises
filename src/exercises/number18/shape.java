package exercises.number18;

public class shape {
    private String color;
    private boolean filled;
    private double radius;
    private double Width;
    private double height;

    public shape(String color, boolean filled, double radius, double white, double height) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
        this.Width = white;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public double getRadius() {
        return radius;
    }

    public double getWidth() {
        return Width;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setWidth(double width) {
        this.Width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String toString() {
        return shape.this.getColor() + " and " + this.isFilled() + " and width is " + this.Width + " and height is: " + height + " and radius is: " + radius;
    }
}

