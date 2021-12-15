package com;
class student{
    int reg;
    String name;
    int semester;
   public void print(){
        System.out.println("my reg is:"+reg);
        System.out.println("my name is:"+name);
        System.out.println("My semester is:"+semester);
    }

};


public class OPP {
    public static void main(String[] args) {
        System.out.println("Let's fun!");
        student  s[]= new student [5];
        for(int i=0;i<5;i++)
        {s[i] = new student();
        s[i].reg=2019331075;
        s[i].name="Md.Mazharul Islam";
        s[i].semester=2;
        }
        for(int i=0;i<5;i++)
        s[i].print();
        /*System.out.println(s1.reg);
        System.out.println(s1.name);
        System.out.println(s1.semester);*/

    }
}
