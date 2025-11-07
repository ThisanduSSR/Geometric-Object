public abstract class GeometricObject {
    protected boolean filled;
    protected String color;

    public GeometricObject() {
        this.filled = false;
        this.color = "white";
    }
    public GeometricObject(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public  boolean getFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "color:"+color+", Filled:"+ filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getShape();
}
