package com;
import java.util.Scanner;
class constructors{
    private int reg;
    private String name;
    public constructors(int x,String y){
        reg=x;
        name=y;

    }
    public void SetReg(int x){
        reg=x;
    }
    public void SetName(String y){
        name=y;
    }
    public int GetReg(){
        return reg;
    }
    public String GetName(){
        return name;
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.nextLine();
        String y=sc.nextLine();
        //constructors s=new constructors();
        constructors s=new constructors(x,y);
        System.out.println(s.GetReg());
        System.out.println(s.GetName());
    }
}
