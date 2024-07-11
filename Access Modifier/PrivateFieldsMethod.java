package com.jala.accessmodifier;

public class PrivateFieldsMethod {
    //private fields
    private String name = "Sharan";
    private int age = 21;

    //private method
    private void pvtMethod() {
        System.out.println("My Name is " + name + " and my age is " + age);
    }

    //main method
    public static void main(String[] args) {
        PrivateFieldsMethod obj = new PrivateFieldsMethod();
        //Printing the fields in main method
        System.out.println(obj.age);
        System.out.println(obj.name);
        //Calling the private method in main method
        obj.pvtMethod();
    }
}
