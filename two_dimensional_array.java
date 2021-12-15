package com;
import java.util.Scanner;

public class two_dimensional_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row of matrix a:");
        int row1=sc.nextInt();
        System.out.println("");
        System.out.print("Enter the column of matrix a:");
        int col1=sc.nextInt();
        System.out.println("");
        System.out.print("Enter the row of matrix b:");
        int row2=sc.nextInt();
        System.out.println("");
        System.out.print("Enter the column of matrix b:");
        int col2=sc.nextInt();
        System.out.println("");
        

        int [][] a=new int [row1][col1];
        int [][] b=new int [row2][col2];

        System.out.println("Enter a matrix:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                int x;
                x=sc.nextInt();
                a[i][j]=x;
            }
        }
        System.out.println("Enter b matrix");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                int y;
                y=sc.nextInt();
                b[i][j]=y;
            }
        }
        // matrix jug
        /*for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+b[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }*/
        // matrix multiplication
        int sum=0;
        if(col1!=row2)
        {
            System.out.println("Sorry!\n Cannot be multiplied!");
        }
        else
        {
            int [][] c=new int [row1][col2];
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {  for(int k=0;k<row2;k++)
                {
                 sum=sum+a[i][k]*b[k][j];
                }
                c[i][j]=sum;
                    sum=0;
                }

            }
            System.out.println("the resulten matrix is:");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    System.out.print(c[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
