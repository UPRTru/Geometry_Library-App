import model.*;

public class Comparison {

    public Integer comparisonModel(Object o1, Object o2) {
        double d1 = 0;
        double d2 = 0;
        if (o1 instanceof Circle c1) d1 = c1.getArea();
        if (o2 instanceof Circle c2) d2 = c2.getArea();
        if (o1 instanceof Rectangle r1) d1 = r1.getArea();
        if (o2 instanceof Rectangle r2) d2 = r2.getArea();
        if (o1 instanceof Triangle t1) d1 = t1.getArea();
        if (o2 instanceof Triangle t2) d2 = t2.getArea();
        if (d1 == 0 || d2 == 0) {
            return null;
        } else {
            return Double.compare(d1, d2);
        }
    }

}
