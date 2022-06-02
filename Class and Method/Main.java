
import java.util.Scanner;

public class Main{

void fun(){
Scanner sc=new Scanner(System.in);	

int a1,b1,c1,a2,b2,c2,ans1,ans2;
a1=sc.nextInt();
b1=sc.nextInt();
c1=sc.nextInt();
a2=sc.nextInt();
b2=sc.nextInt();
c2=sc.nextInt();
ans1=a1+b1+c1;
ans2=a2+b2+c2;
if(ans1>ans2){
	
	System.out.println("Dragon");
}
else if(ans1<ans2){
	
	System.out.println("Sloth");
}
else{
	if(a1>a2)
	System.out.println("Dragon");
	else if(a1<a2)
	System.out.println("Sloth");
	else if(b1>b2)
	System.out.println("Dragon");

	else if(b1<b2)
	System.out.println("Sloth");
	else
	System.out.println("Tie");

}



}
	
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int t=sc.nextInt();
Main obj=new Main();
while(t>0){
	
obj.fun();
t--;

}	
 


}



}