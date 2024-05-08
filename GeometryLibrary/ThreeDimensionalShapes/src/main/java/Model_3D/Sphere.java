package Model_3D;

public class Sphere {
    private final double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public double getArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
