package edu.oca.java.se8.certification._1Z0_808.chapter5._interfaceStatic;

public class Bunny implements Hop{
    public void printDetails() {
        //System.out.println(getJumpHeight()); // DOES NOT COMPILE
        System.out.println(Hop.getJumpHeight());
    }
}
