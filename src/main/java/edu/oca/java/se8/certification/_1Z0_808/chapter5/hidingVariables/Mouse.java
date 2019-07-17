package edu.oca.java.se8.certification._1Z0_808.chapter5.hidingVariables;

public class Mouse extends Rodent{

    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails(); //[parentTail=4]
        mouse.getMouseDetails(); //[tail=8,parentTail=4]
    }
}

