

class box{
	int width;
	int breadth;
	int height;
	box(){
	  width=-1;
	  breadth=-1;
	  height=-1;
	}
	box(int w,int b,int h){
	  width=w;
	  breadth=b;
	  height=h;
	}
	void volume(){
	System.out.println((width*breadth*height));
	}

}
class weightbox extends box{
	double weight;
	weightbox(int w,int b,int h,double wt){
	   super(w,b,h);
	   weight=wt;
	}

}
class sampleInheritance2{
	
public static void main(String [] args){
	
	box a=new box();
	weightbox b= new weightbox(2 ,3,4,5.5);
	b.volume();
	a=b;
	a.volume();


}

}