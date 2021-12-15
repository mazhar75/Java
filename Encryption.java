package com;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char c=sc.next().charAt(0);
        //encrypt grade
        char c1 =(char)(c+8);
        System.out.println(c1);
        //decrypt grade
        char grade =(char)(c1-8);
        System.out.println(grade);

    }
}
