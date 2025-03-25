public class ColorFactory extends AbstractFactory{
    Shape shape = null;
    Color color=null;
    public Shape getShapeInstance(String type, double...nums){
        return shape;
    }
    public Color getColorInstance(String type){
        if(type.equalsIgnoreCase("Red")){
            return new Red();
        }
        else if(type.equalsIgnoreCase("Green")){
            return new Green();
        }
        else if(type.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return color;
    }
}
