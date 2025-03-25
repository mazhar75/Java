abstract class AbstractFactory{
    abstract Shape getShapeInstance(String type, double...nums);
    abstract Color getColorInstance(String type);
}
