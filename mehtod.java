package com;

public class mehtod {
     int fun(int x,int y){
        x=0;
        int z=x;
        return z;
    }
    public static void main(String[] args) {
        int a=34;
        int b=56;
        mehtod obj=new mehtod();
        System.out.println(obj.fun(a,b));
    }
}
