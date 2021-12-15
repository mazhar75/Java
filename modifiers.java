package com;
class hello{
     int reg;
    String  name;
    public void setname(String n){
        name=n;
    }
    public void setreg(int n){
        reg=n;
    }
    public String getname(){
        return name;

    }
    public int getreg(){
        return reg;
    }

}

public class modifiers {
    public static void main(String[] args) {
        hello student[]=new hello[100];
        for(int i=0;i<100;i++)
        {
            student[i]=new hello();
            student[i].setname("nihad");
            student[i].setreg(2019);


        }
        for(int i=0;i<100;i++){
            System.out.println(student[i].getname());
            System.out.println(student[i].getreg())  ;
        }

    }
}
