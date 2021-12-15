package com;
import java.util.Locale;
import java.util.Scanner;


public class new_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        //1. to evaluate length of the string
        int l=s.length();
        System.out.println(l);
        String s1,s2;
        //2.convert all character in lowercase
        s1=s.toLowerCase(Locale.ROOT);
        System.out.println(s1);
        //3.convert all character into uppercase
        s2=s.toUpperCase(Locale.ROOT);
        System.out.println(s2);
        //4.print line without space
        //sentence er ager and porer space dlt kore print kore but sentence or vitore word or majher space ager jaygay thake.
        System.out.println(s.trim());
        //5. s.substring() use for print subtring;
        System.out.println(s.substring(3,6));
        //6.s.replace(char,char) use for replacing 1st char by 2nd char
        //also s.replace(string,string) will work
        String s3="wow cse wow!";
        String s4=s3.replace('w','l');
        System.out.println(s4);
        //7. check a string is starting with spacific string or char by function s.StartWith("");
        System.out.println(s.startsWith("w"));
        //8.  s.endwith("") check that the string is end with specific char or not
        System.out.println(s.endsWith("w"));
        //9. to check index char
        System.out.println(s.charAt(4));
        //10.check char index
        System.out.println(s.indexOf("s"));

    }
}
