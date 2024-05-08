package model;

public class Circle {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return r * r * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
