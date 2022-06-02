
class dqueue{
  public static void main(String [] args){
   dequeue q=new dequeue();
   for(int i=0;i<=50;i++){
     q.pushFirst(i);
	 }
	  for(int i=0;i<=50;i++){
     q.pushLast(i);
	 }
	 for(int i=0;i<=50;i++){
     System.out.println(q.popFirst());
	 }
	  for(int i=0;i<=50;i++){
     System.out.println(q.popLast());
	 }
	 }
	 }