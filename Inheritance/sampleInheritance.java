
class nihad{
	int age;
	String sex;
	float height;
	void shownihad(){
	System.out.println("Nihad's data:");
	System.out.println("Age= "+age);
	System.out.println("Sex= "+sex);
	System.out.println("Height= "+height);
	}
}


class nushin extends nihad{
  	
void shownushin(){
    System.out.println("Nushin's data:");
    System.out.println("Age= "+age);
	System.out.println("Sex= "+sex);
	System.out.println("Height= "+height);
}

}
class sampleInheritance{
public static void main(String[] args){
nihad supOb= new nihad();
nushin subOb=new nushin();
supOb.age=21;
supOb.sex="Male";
supOb.height=5.5f;
supOb.shownihad();
subOb.age=21;
subOb.sex="Female";
subOb.height=4.8f;
subOb.shownushin();	



}
}