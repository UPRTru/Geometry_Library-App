import Model_3D.Cube;
import Model_3D.Sphere;
import model.*;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Area of triangle: " + triangle.getArea());
        System.out.println("Perimeter of triangle: " + triangle.getPerimeter());

        Comparison comparison = new Comparison();
        System.out.println("Comparison between circle and rectangle: " + comparison.comparisonModel(circle, rectangle));

        Conversion conversion = new Conversion();
        System.out.println("10cm to Mm: " + conversion.convertCmToMm(10));
        System.out.println("10mm to Cm: " + conversion.convertMmToCm(10));
        System.out.println("100cm to M: " + conversion.convertCmToM(100));
        System.out.println("1m to Cm: " + conversion.convertMToCm(1));

        Cube cube = new Cube(5);
        System.out.println("Volume of cube: " + cube.getVolume());
        System.out.println("Area of cube: " + cube.getArea());
        System.out.println("Perimeter of cube: " + cube.getPerimeter());

        Sphere sphere = new Sphere(5);
        System.out.println("Volume of sphere: " + sphere.getVolume());
        System.out.println("Area of sphere: " + sphere.getArea());
        System.out.println("Perimeter of sphere: " + sphere.getPerimeter());
    }
}
