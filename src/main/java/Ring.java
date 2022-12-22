public class Ring extends Circle {

    public Ring(double x, double y, double radius) {
        super(x, y, radius);
    }

    public static boolean pointIsInRing(Point point, Ring ring) {
        return Math.pow((point.x - ring.x), 2) + Math.pow((point.y - ring.y), 2) <= Math.pow(ring.radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Ring{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
