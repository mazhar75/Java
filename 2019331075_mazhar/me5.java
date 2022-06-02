



class box{
double height,width,depth;
 double volume(){
  return height*width*depth;
 }
box(double h,double w,double d){


height=h;
width=w;
depth=d;
}
}
class me5{
 public static void main(String [] args){
  box a=new box(20,15,10);
  box b=new box(9,6,3);
  double vol;
  
 
  vol=a.volume();
  System.out.println("Volume is="+vol);
  
  
  vol=b.volume();
  System.out.println("Volume is="+vol);
              }
	}		  
