public class Rectangle implements Shape{
    double a,b;
    Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }
    public double area(){
        return a*b;
    }
    public double perimeter(){
        return 2*(a+b);
    }
}
