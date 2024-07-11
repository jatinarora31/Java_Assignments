package com.jala.operators;

public class Logical {
    public static void main(String[] args) {
        int a = 50;
        int b = 30;
        int c = 10;
        
        System.out.println(a > b && a > c); // true  && true  = true
        System.out.println(a < b && a < c); // false && false = false
        System.out.println(a > b && a < c); // true  && false = false

        System.out.println(a > b || a > c); // true  || true  = true
        System.out.println(a < b || a < c); // false || false = false
        System.out.println(a < b || a > c); // false || true  = true
        
        System.out.println(!(a > b));      // NOT true = false
        System.out.println(!(a < b));      // NOT false = true
    }
}
