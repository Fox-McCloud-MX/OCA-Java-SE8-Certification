package edu.oca.java.se8.certification._1Z0_808.chapter5.overridingAndHiding;

public class Marsupial {

    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}
