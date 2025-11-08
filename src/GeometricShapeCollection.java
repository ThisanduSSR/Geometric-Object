import java.util.Scanner;
public class GeometricShapeCollection implements ShapeCollection{
    private GeometricObject[] shapeList;
    private int maxNumShape;
    public static int totalNumShape;

    public GeometricShapeCollection(int listLength){
        this.maxNumShape = listLength;
        shapeList = new GeometricObject[maxNumShape];
    }
    @Override
    public void addShape(GeometricObject shape) {
        if(totalNumShape < maxNumShape) {
            shapeList[totalNumShape] = shape;
            totalNumShape++;
        }
        else{
            System.out.println("No more space in the list");
        }
    }
    public void printShapeList() {
        for(int i = 0; i<totalNumShape; i++){
            GeometricObject shape = shapeList[i];
            System.out.println("shape = "+shape.getShape()+",Area ="+shape.getArea()+", Perimeter ="+shape.getPerimeter());

        }
    }


}
