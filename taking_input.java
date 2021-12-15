package com;
import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
       // System.out.println("taking input from user:");
        Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();//get input integer number
       int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the summation of two number is:");
       // String str=sc.nextLine();//to get input string with space!
       // System.out.println(str);
     System.out.println(sum);

    }
}
