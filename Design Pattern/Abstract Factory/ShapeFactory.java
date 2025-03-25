public class ShapeFactory extends AbstractFactory{
    Shape shape = null;
    Color color=null;
    public Shape getShapeInstance(String type, double...nums){
      if(type.equalsIgnoreCase("CIRCLE")){
        double radius=0;
        for(double x: nums){
           radius=x;
        }
         return new Circle(radius);
      }
      else if(type.equalsIgnoreCase(("Square"))){
         double side=0;
         for(double x:nums){
          side=x;
         }
         return new Square(side);
      }
      else if(type.equalsIgnoreCase("Rectangle")){
        double a=0,b=0;
        for(double x: nums){
          if(a==0)a=x;
          else b=x;
        }
        return new Rectangle(a,b);
      }
      return shape;
    }
    public Color getColorInstance(String type){
        
        return color;
    }

}
