
class dequeue{
private int front,end,first,last;
int [] dq=new int [1000];
dequeue(){
front=-1;
first=-1;
end=1000;
last=1000;
}
void pushFirst(int val){
 
 if(front+1==end){
 System.out.println("Overflow");
 return;}
 if(front==-1){
 dq[++front]=val;
 first++;}
dq[++front]=val;
 }
 void pushLast(int val){
 if(end-1==front){
 System.out.println("Overflow!");
 return ;
 }
 if(end==1000){
 dq[--end]=val;
 --last;}
 dq[--end]=val;
 }
 int popFirst(){
 if(last==first){
 System.out.println("Underflow!");
 return -1;
 }
 if(first==front){
 first=end;
 return dq[last];
 }
 return dq[first++];
 }
 int popLast(){
 if(first==last){
 System.out.println("Underflow!");
 return -1;
 }
 if(last==end){
 last=front;
 return dq[last];
 }
 return dq[last--];
 }
 }
 
 
 
 
 
 
