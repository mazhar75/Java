package Factory;

public class ShapeFactory {
    Shape shape = null;
    public Shape getInstance(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            shape = new Circle();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            shape = new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            shape = new Square();
        }
        return shape;
    }
}
