package Factory;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory sf= new ShapeFactory();
        Shape shape1=sf.getInstance("CIRCLE");
        Shape shape2=sf.getInstance("Rectangle");
        Shape shape3 = sf.getInstance("Square");
        shape1.draw();
        shape2.draw();
        shape3.draw();

        
    }
}
