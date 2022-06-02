
import java.util.Scanner;

public class sumOfArray{
	
public static void main(String[] args){
	

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of array:\n");
	int n=sc.nextInt();
	int [] arr=new int [n];
	for(int i=0;i<n;i++){
    int x;
    x=sc.nextInt();
    arr[i]=x;

	}
	int sum=0;
	float avg;
	for(int i=0;i<n;i++){
	sum+=arr[i];
	}
	avg=(sum)/n;
	System.out.print("sum= "+sum+" "+"average="+" "+avg);
}


}