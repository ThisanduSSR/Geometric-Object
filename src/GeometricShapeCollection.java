import java.util.Scanner;
public class GeometricShapeCollection implements ShapeCollection{
    private GeometricObject[] shapeList;
    private int maxNumShape;
    public static int totalNumShape;

    public GeometricShapeCollection(int listLength){
        this.maxNumShape = listLength;
        shapeList = new GeometricObject[maxNumShape];
    }


}
