public class Rectangle extends GeometricObject {
    protected double length;
    protected double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public Rectangle(double l, double w, String color,boolean filled) {
        super(color, filled);
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return length + width;
    }

    public double getArea() {
        return length * width;
    }

    public String getShape() {
        return "Rectangle";
    }

    public String toString() {
        return super.toString() + "\nLength: " + length + "\nWidth: " + width + "\n";
    }
}
