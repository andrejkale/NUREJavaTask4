public class Main {
    public static void main(String[] args) {
        Ring ring = new Ring(2, 3, 6);
        Point point = new Point(5, 7);
        System.out.println(ring);
        System.out.println(Ring.pointIsInRing(point, ring));

        ring.sizing(3, 10, 15);
        System.out.println(ring);
        System.out.println(Ring.pointIsInRing(point, ring));
    }
}
