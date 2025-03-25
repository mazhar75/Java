

class box{
double height,width,depth;
 double volume(){
  return height*width*depth;
 }
 void setvalue(double h,double w,double d){
	 height=h;
	 width=w;
	 depth=d;
 }
}
class me3{
 public static void main(String [] args){
  box a=new box();
  box b=new box();
  double vol;
  
  a.setvalue(20,15,10);
  vol=a.volume();
  System.out.println("Volume is="+vol);
  
   b.setvalue(9,6,3);
  vol=b.volume();
  System.out.println("Volume is="+vol);
              }
	}		  
