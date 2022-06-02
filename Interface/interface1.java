
class Client implements Callback{
 
 public void callback(int p){
  System.out.println("You called last number was:"+p);

 }	
 void noninterface(){
 System.out.println("Its class Client's property,you cannot access it via inteface Callback");
 }
 }
 class anotherClient implements Callback{

 	 public void callback(int p){
  System.out.println("Your 2nd called last number was:"+p);

 }	
 }
 interface Callback{

 	void callback(int param);
 }
 public class interface1{
 public static void main(String[] args){
 Callback c=new Client();
 Callback a=new anotherClient();
 c.callback(12);
 Client b=new Client();
 b.noninterface();
 c=a;
 c.callback(13);

 }

 }