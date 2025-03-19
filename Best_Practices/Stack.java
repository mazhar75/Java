class MyStack{
   int[] array;
   int size;
   int top;
   MyStack(int size){
    this.size=size;
    array=new int[size];
    top=-1;
   }
   void push(int value){
     if(top==size-1){
        System.out.println("Stack Overflow");
     }
     array[++top]=value;
   }
   void pop(){
     if(top==-1){
        System.out.println("Stack Underflow");
     }
     --top;
   }
   int Top(){
     if(top==-1){
        System.out.println("Empty Stack");
     }
     return array[top];
   }
   boolean IsEmpty(){
      if(top==-1){
        return true;
      }
      return false;
   }

}
class Stack{
    public static void main(String[] args){
      MyStack st=new MyStack(5);
      for(int i=1;i<=5;i++){
        st.push(i);
      }
      while(!st.IsEmpty()){
         int top=st.Top();
         st.pop();
         System.out.println(top);
      }
    }
}