class box{
double height,width,depth;
}
class me{
 public static void main(String [] args){
  box a=new box();
  box b=new box();
  double vol;
  a.height=20;
  a.width=15;
  a.depth=10;
  vol=a.height*a.width*a.depth;
  System.out.println("Volume is="+vol);
  
  b.height=9;
  b.width=6;
  b.depth=3;
  vol=b.height*a.width*a.depth;
  System.out.println("Volume is="+vol);
              }
	}		  
