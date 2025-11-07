public class Circle extends GeometricObject {
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double r) {
        this.radius = r;
    }
    public Circle(double r, String color, boolean filled) {
        super(color, filled);
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String getShape() {
        return "Circle";
    }
    public String toString() {
        return "Circle: " + radius + " " + super.toString();
    }
}
