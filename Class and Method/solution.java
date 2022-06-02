

import java.util.Scanner;

public class solution{
	
 public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 long n,k;
 while(t>0){
 n=sc.nextLong();
 k=sc.nextLong();
 long time,d1,d2;
 d1=k*(k+1L)/2L;
 d2=n-d1;
 if(d2%k==0)
 	time=d2/k;
 else 
 	time=d2/k+1;

 time+=k;
 System.out.println(time);


 

 t--;

 }
 }

}