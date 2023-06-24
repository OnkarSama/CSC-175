/**
 * A Rectangle with a length and width, and a method to compute area.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape {
    // Instance data
    private double length, width;

    /**
     * Constructor: initialize length and width
     */
    public Rectangle(int x, int y, double l, double w) {
        super.setCords(x, y);
        this.length = l;
        this.width = w;
    }

    /**
     * area: compute area of a rectangle.
     *
     * @return a double, the area of a rectangle
     */
    public double area() {
        return this.length * this.width;
    }

    @Override
    public String toString() {

        return super.toString() + " The rectangle has a length of " + length + " and and width of " + width + " which has an area of " + area();

    }
}
