package com;
import java.util.Scanner;

public class for_each_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String  [] students=new String[n];// declaring an array
        for(int i=0;i<n;i++)
        {
            String x;
            x=sc.next();
            students[i]=x;
        }
        for(String element:students)//for-each loop
        {
            System.out.println(element);
        }
    }

}
