package com;
import java.util.Scanner;

public class varags {
    static int sum(int ...arr){
        int sum=0;
        for(int e:arr){
            sum=sum+e;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Sum of two integers is:");
        System.out.println(sum(a, b));
    }
}
