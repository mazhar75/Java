
class mazhar{
   public static void main(String [] args){
   queue st=new queue();
   for(int i=1;i<25;i++){
   st.push(i);
   }
   for(int i=1;i<30;i++){
   System.out.println(st.pop());
   }
   st.push(100);
   st.push(1000);
   st.push(34560);
   System.out.println(st.pop());
   System.out.println(st.pop());
   System.out.println(st.pop());
   
   }
}