package com.jala.operators;

import java.util.Scanner;

public class Equal_NotEqual {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Both numbers are equal");
        }
        else if (a != b) {
            System.out.println("Both numbers are different");
        }
    }
        
}
