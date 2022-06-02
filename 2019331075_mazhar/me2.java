
class box{
double height,width,depth;
 void volume(){
   System.out.print("Volume is=");
   System.out.println(width*height*depth);
 }
}
class me2{
 public static void main(String [] args){
  box a=new box();
  box b=new box();
  double vol;
  a.height=20;
  a.width=15;
  a.depth=10;
  a.volume();
  
  b.height=9;
  b.width=6;
  b.depth=3;
 b.volume();
              }
	}		  
