package com;
import java.util.Scanner;

public class problem_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.endsWith("ist")) {
            System.out.println("ist");
        } else if (s.endsWith("er")) {
            System.out.println("er");
        }
    }
}