public class FactoryDemoMain {
    public static void main(String [] args){
       AbstractFactory shapefactory = Factory.getFactory(("Shape"));
       AbstractFactory colorfactory = Factory.getFactory("color");

       //Getting shape instance like square,circle,rectangle
       Shape circle = shapefactory.getShapeInstance("circle",1.2);
       Shape square = shapefactory.getShapeInstance("Square", 5.0);
       Shape rectangle = shapefactory.getShapeInstance("rectangle", 4.5,5.8);

       System.out.println("Let's rock------------------------------");
       System.out.println("");
       System.out.print("Circle's Results-->");
       System.out.println(" Area : "+circle.area()+" Perimeter : "+circle.perimeter());
       System.out.println("----------------------------------------");
       System.out.println("");
       System.out.print("Square's Results-->");
       System.out.println(" Area : "+square.area()+" Perimeter : "+square.perimeter());
       System.out.println("----------------------------------------");
       System.out.println("");
       System.out.print("Rectangle's Results-->");
       System.out.println(" Area : "+rectangle.area()+" Perimeter : "+rectangle.perimeter());
       System.out.println("----------------------------------------");
       System.out.println("");

       Color red=colorfactory.getColorInstance("red");
       Color green = colorfactory.getColorInstance("green");
       Color blue= colorfactory.getColorInstance("blue");
       
       System.out.println("");
       System.out.println("Color Results ");
       System.out.println("");
       System.out.println("Red Result : "+red.fill());
       System.out.println("Green Result : "+green.fill());
       System.out.println("Blue Result : "+blue.fill());




    }
}
