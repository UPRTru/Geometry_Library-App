package Model_3D;

public class Cube {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public double getArea() {
        return 6 * (side * side);
    }

    public double getPerimeter() {
        return 12 * side;
    }
}
