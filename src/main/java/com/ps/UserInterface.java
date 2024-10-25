package com.ps;

public class UserInterface {
    Dealership dealership = new Dealership("name","address","phone");
    // static Dealership dealership;
    public static void init(){
        System.out.println("Init method");
        System.out.println("");
        //Loading dealership and inventory from file
    }
    public static void display(){
        init();
        System.out.println("Load the menu...");
        //load menu from file
    }
}