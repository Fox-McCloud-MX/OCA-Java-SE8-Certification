package edu.oca.java.se8.certification._1Z0_808.chapter5.hidingVariables;

public class Rodent {

    protected int tailLength = 4;

    public void getRodentDetails() {
        System.out.println("[parentTail=" + tailLength + "]");
    }
}
