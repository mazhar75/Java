
import java.util.Scanner;

//program to calculate average of three integers;

public class mazhar75{              //filename same howa lage 

void myMethod(){
Scanner sc=new Scanner(System.in);  // input newr jonno object;
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
float avg=a+b+c/3;
System.out.println(avg);	


}
	
public static void main(String[] args){     //main function
	
mazhar75 obj=new mazhar75();          //object create for method;
obj.myMethod();



}


}

