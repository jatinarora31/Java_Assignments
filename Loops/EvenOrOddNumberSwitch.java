package com.jala.loops;
import java.util.Scanner;

public class EvenOrOddNumberSwitch {
     public static void main(String[] args) {
        int n;
        System.out.print("Enter a number : ");
        //user input stored in n
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        switch (n % 2) {
            //Even number has a remainder of 0 if divided by 2
            case 0:
                System.out.println(n + " is an Even Number");
                break;
               
            case 1:
                System.out.println(n + " is an Odd Number");
                break;
        }
    }
    
}
