package edu.oca.java.se8.certification._1Z0_808.chapter5.polymorphism.overriding;

public class Gorilla extends Animal{

    /*
    getName() in Gorilla cannot override getName() in Animal attempting to 
    assign weaker access privileges; was public
    */
    /*protected String getName() { // DOES NOT COMPILE
        return "Gorilla";
    }*/
    
    //Need to be public
    @Override
    public String getName() { // DOES NOT COMPILE
        return "Gorilla";
    }
}
