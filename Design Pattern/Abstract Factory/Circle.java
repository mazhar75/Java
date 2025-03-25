public class Circle implements Shape{
    final double pi=3.1416;
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }
}
