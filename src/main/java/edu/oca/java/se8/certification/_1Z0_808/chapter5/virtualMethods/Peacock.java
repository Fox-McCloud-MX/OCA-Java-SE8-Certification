package edu.oca.java.se8.certification._1Z0_808.chapter5.virtualMethods;

public class Peacock extends Bird{

    @Override
    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation(); //The bird name is: Peacock
    }
}
