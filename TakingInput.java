package com.company;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking numbers from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of the first two number is");
        System.out.println(sum);
    }
}
