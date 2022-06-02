
class stack{
 private int top,end;
 int [] a=new int[20];
 stack(){
 top=-1;
 end=-1;
 }
 void push(int val){
   if(top>=19){
   System.out.println("Stack overflow");
   return;
   }
   a[++top]=val;
   }
   int pop(){
   if(top<0){
   System.out.println("stack Underflow!");
   return -1;}
   return a[top--];
   }
   int top(){
   return a[top];
   }
   }