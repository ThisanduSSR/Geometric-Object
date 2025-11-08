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
    @Override
    public void printShapeList() {
        for(int i = 0; i<totalNumShape; i++){
            GeometricObject shape = shapeList[i];
            System.out.println("shape = "+shape.getShape()+",Area ="+shape.getArea()+", Perimeter ="+shape.getPerimeter());

        }
    }
    @Override
    public boolean runMenu() {
        Scanner s = new Scanner(System.in);
        boolean exit = false;

        System.out.println("\n---shape Menu---");
        System.out.println("1. Add Shape");
        System.out.println("2. Print Shape");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();

        switch(choice){
            case 1:
                if(totalNumShape < maxNumShape){
                    System.out.println("Select shape: 1.circle 2.Rectangle 3.Square");
                    int type = s.nextInt();
                    s.nextLine();

                    System.out.print("Enter color;");
                    String color = s.nextLine();

                    System.out.println("Is filled(y/n):");
                    boolean filled = s.nextLine().equalsIgnoreCase("y");

                    switch (type) {
                        case 1:
                            System.out.println("Enter radius:");
                            double r = s.nextDouble();
                            addShape(new Circle(r, color, filled));
                            break;
                        case 2:
                            System.out.println("Enter length:");
                            double l = s.nextDouble();
                            System.out.println("Enter width:");
                            double w = s.nextDouble();
                            addShape(new Rectangle(l, w, color, filled));
                            break;
                        case 3:
                            System.out.println("Enter side:");
                            double side = s.nextDouble();
                            addShape(new Square(side, color, filled));
                            break;
                    }
                }

        }
    }


}
