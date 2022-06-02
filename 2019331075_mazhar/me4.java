


class box{
double height,width,depth;
 double volume(){
  return height*width*depth;
 }
box(){
System.out.println("Constructing box");
height=10;
width=10;
depth=10;
}
}
class me4{
 public static void main(String [] args){
  box a=new box();
  box b=new box();
  double vol;
  
 
  vol=a.volume();
  System.out.println("Volume is="+vol);
  
  
  vol=b.volume();
  System.out.println("Volume is="+vol);
              }
	}		  
