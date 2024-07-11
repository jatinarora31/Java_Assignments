package com.jala.basics;

public class LocalGlobalVariables {
    int a = 31;
    void localvariable(){
        int a = 50;
        System.out.println("Local Variable a: "+a);
    }
    public static void main(String []args) {
        LocalGlobalVariables obj = new LocalGlobalVariables();
        System.out.println("Instance Variable a: "+obj.a);
        obj.localvariable();
    }
    
}
