package com;
import java.util.Scanner;
import  java.util.Random;
class random_number{
    public int rand_num;
    public random_number(){
    Random rand=new Random();
    int upperbound=100;
     rand_num=rand.nextInt(upperbound);
    }
   // public void setRand()(int x){
   // rand_=n;
   //}
    public int GetRand(){
        return rand_num;
    }
}
class getinput {
     int getInput() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}

public class number_guess_game {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        System.out.println("");
        int a=0;
        random_number s=new random_number();
        int n=s.GetRand();
        getinput obj=new getinput();
        int number1=obj.getInput();
        while(number1!=n)
        {  if(number1<n) {
            System.out.println("Your number is lower than ,increment it!");
            getinput obj1 = new getinput();
            int number1 = obj1.getInput();
            a++;
        }
        else
        {
            System.out.println("Your number is bigger,decrement it!");
            getinput obj2 = new getinput();
            int number1;
            number1 = obj2.getInput();
            a++;
        }

        }
        System.out.println("Wow!U did it.");
        System.out.println("your needed approch is:"+a);
        //System.out.println("");

    }
}
