package com;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors_game {
    public static void main(String[] args) {
        /* here
        num=0=rock
        num=1=paper
        num=2=scissor
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your turn:");
        String s=sc.next();
        int num=0,a=0;
        { if(s.startsWith("rock"))
        {
            num=0;
        }
        else if(s.startsWith("paper"))
        {
            num=1;
        }
        else if(s.startsWith("scissor"))
        {
            num=2;
        }}
        for(int i=0;i<20;i++) {
            Random rand=new Random();
            int upperbound=3;
            int n=rand.nextInt(upperbound);

            switch (num) {
                case 0: {
                    if (n == 1) {
                        System.out.println("You Lose!\nBest of luck next time!");
                    } else if (n == 2) {
                        ++a;
                        System.out.println("Congratulation! You win! ");
                    }
                }
                break;

                case 1: {
                    if (n == 2) {
                        System.out.println("You Lose!\nBest of luck next time!");
                    } else if (n == 0) {
                        ++a;
                        System.out.println("Congratulation! You win! ");
                    }
                }
                break;
                case 2: {
                    if (n == 0) {
                        System.out.println("You Lose!\nBest of luck next time!");
                    } else if (n == 1) {
                        ++a;
                        System.out.println("Congratulation! You win! ");
                    }
                }
                break;
            }
        }
        if(a>5)
        {
            System.out.println("great job!");
        }
        else if(a==5)
        {
            System.out.println("Draw");
        }
        else
            System.out.println("Alas! You lose.");
    }
}
