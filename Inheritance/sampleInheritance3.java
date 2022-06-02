
class a{
	
	private int x;
	private int y;
	private int z;
	a(int p,int q,int r){
    x=p;
    y=q;
    z=r;
    }
    a(a obj){
    x=obj.x;
    y=obj.y; 
    z=obj.z;

    }
    void sum(){

    	System.out.println(x+y+z);
    }
}
class b extends a{
	
  int w;
  b(int p,int q,int r,int s){
   super(p,q,r);
   w=s;

  }
  b(b obj){
  super(obj);
  w=obj.w;

  }

}
class c extends b{
 int v;
 c(int p,int q,int r,int s,int t){
 	super(p,q,r,s);
 	v=t;
 }
 c(c obj){
 	super(obj);
 	v=obj.v;
 }
 void sum(){

 	System.out.println(w+v);
 }


}
class sampleInheritance3{
public static void main(String [] args){
 a a1=new a(1,2,3);
 a a2=new a(a1);
 b b1=new b(1,2,3,4);
 b b2=new b(b1);
 a2=b2;
 a2.sum();	
 c c1=new c(-1,-2,-3,-4,-5);
 c c2=new c(c1);
 c2.sum();
 a1=c2;
 a1.sum();

}
}