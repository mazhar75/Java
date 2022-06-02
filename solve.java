
// Stay positive
//Do hard work
//If You Want You can.
import java.util.Scanner;
import java.util.Arrays;
//import java.lang.Math;
import java.util.*;

 public class solve
{
	/**static int gcd(int a,int b)
	{  
	    if(b==0)return a;
		return gcd(b,a%b);
	}	
	*/
	
public static void main(String[] args)
    {
	
	Scanner sc=new Scanner(System.in);
	int n,k;
	n=sc.nextInt();
	k=sc.nextInt();
	 int [] q=new int [n];
	 Set<Integer> a = new HashSet<Integer>();
	 
	for(int i=0;i<n;i++){
    int  x;
    x=sc.nextInt();
    q[i]=x;
    a.add(x);
	}
	if(a.size()<k){

		System.out.println("NO");
	}
	else{

		System.out.println("YES");
		 //Iterator itr = a.iterator();
		int b [] = new int[k];
		int j=0;
		for(Integer ans: a){
          if(j<k) {
          b[j]=ans;
          j++;
      }
          else  {
          break;
      }

		}
		//Arrays.sort(q);
		j=0;
		for(int i=0;i<k;i++){
           for(j=0;j<n;j++){
             if(b[i]==q[j]){
             	System.out.print(j+1 + " ");
             	break;
             }

           }

		}
		System.out.println(" ");
	}
}
}