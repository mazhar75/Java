class Sex
{
    String sex;
    Sex(String sex){
        this.sex=sex;
    }
}

public class Test {
    public static void main(String[] args){
        Sex x=new Sex("Male");
        Sex y=x;
        System.out.println(x.sex);
        System.out.println(y.sex);
        y.sex="Female";
        System.out.println(x.sex);
        System.out.println(y.sex);
        y=new Sex("Hijra");
        System.out.println(x.sex);
        System.out.println(y.sex);
        x.sex="Male";
        System.out.println(x.sex);
        System.out.println(y.sex);



    }
}
