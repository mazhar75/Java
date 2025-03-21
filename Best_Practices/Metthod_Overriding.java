class A{
  int x;
  A(int x){
    this.x=x;
  }
  void show(){
    System.out.println("Inner super class , x = "+x);
  }
}
class B extends A{
    int y;
    B(int x,int y){
     super(x);
     this.y=y;
    }
    void show(){
        System.out.println("Inner sub class , y = "+y);
    }
}

public class Metthod_Overriding {
    public static void main(String[] args){
         A a= new B(1,2);
         a.show();
         B b=new B(1,2);
         b.show();

    }
}
