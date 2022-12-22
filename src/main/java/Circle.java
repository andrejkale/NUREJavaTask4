import java.util.Objects;

public class Circle extends Point {

    public double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        if (radius > 0.0) {
            this.radius = radius;
        } else {
            this.radius = 1.0;
        }
    }

    public void sizing(double newX, double newY, double newRadius) {
        x += newX;
        y += newY;
        radius = changeRadius(newRadius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    private double changeRadius(double radiusNewSize) {
        if (radiusNewSize > 0.0) {
            return radius = radiusNewSize;
        }
        else {
            System.out.println("Radius should be more than 0");
            return radius = 1.0;
        }
    }
}
