public class TestPoint {
    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 3);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(0, 0);

        double distance1 = p1.calcDistance(p2);
        double distance2 = p3.calcDistance(p4);

        System.out.println("P1 = " + p1.toString());
        System.out.println("P2 = " + p2.toString());
        System.out.println("P3 = " + p3.toString());
        System.out.println("P4 = " + p4.toString());

        System.out.println("The distance between " + p1 + " and " + p2 + " is " + distance1);
        System.out.println("The distance between " + p3 + " and " + p4 + " is " + distance2);

        System.out.println("P1 equals P2: " + p1.equals(p2)); // should print false
        System.out.println("P1 equals P4: " + p1.equals(p4)); // should print true
    }
}