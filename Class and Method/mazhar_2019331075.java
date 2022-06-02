// simple java program to calculate volume of a box
import java.util.Scanner;
class box{
double height;
double width;
double breadth;
};
class mazhar_2019331075{
  public static void main(String[] args){
   box mybox=new box();
   Scanner sc=new Scanner(System.in);
   double volume;
   mybox.height=sc.nextDouble();
   mybox.width=sc.nextDouble();
   mybox.breadth=sc.nextDouble();
   volume=mybox.height*mybox.width*mybox.breadth;
   System.out.println("The volume of the box height= " +mybox.height+" width= "+mybox.width+"  breadth= "+mybox.breadth +"is : "+volume);
   }
   }