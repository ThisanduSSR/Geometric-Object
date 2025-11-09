public void addShape(GeometricObject shape){
    if(totalNumShape < maxNumShape){
        shapeList[totalNumShape] = shape;
        totalNumShape++
    } else{
        System.out.println("No more space in the list");
    }
}
