class queue{
 private int front,end;
  int [] q=new int[1000];
  queue(){
  front=-1;
  end=-1;
  }
  void push(int val){
  if(front==-1){
  front++;end++;
  q[end]=val;
  return;
  }
  if(end==999){
  System.out.println("Stack Overflow!");
  return;}
  q[++end]=val;
  }
  int pop(){
  if(front>end){
  System.out.println("The queue is empty!");
  return -1;
  }
  return q[front++];
  }
     }
  
  
  
 