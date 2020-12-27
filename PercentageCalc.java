package com.company;
import java.util.Scanner;

public class PercentageCalc {
    public static void main(String[] args) {
        System.out.println("CBSE Board Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100");
        System.out.print("Marathi:");
        int a = sc.nextInt();
        System.out.print("Hindi:");
        int b = sc.nextInt();
        System.out.print("English:");
        int c = sc.nextInt();
        System.out.print("Science:");
        int d = sc.nextInt();
        System.out.print("Maths:");
        int e = sc.nextInt();
        System.out.println("Excellent!!");

        int Total = a+b+c+d+e;
        System.out.println("You got "+Total+" out of 500");

        float percentage = (Total*100)/500;

        System.out.println("Percentage of Overall Scored Marks:"+percentage);


    }

}
