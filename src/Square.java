public class Square extends GeometricObject {
    protected double side;

    public Square() {
        this.side = 1.0;
    }
    public Square(double s) {
        this.side = s;
    }
    public Square(double s, String color, boolean filled) {
        super(color, filled);
        this.side = s;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return (side * side)*2;
    }
    public String getShape() {
        return "Square";
    }
    public String toString() {
        return super.toString() + " " + getSide();
    }
}
