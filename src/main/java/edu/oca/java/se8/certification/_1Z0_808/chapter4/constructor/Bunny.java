package edu.oca.java.se8.certification._1Z0_808.chapter4.constructor;

public class Bunny {

    private String color;
    private int height;
    private int length;

    public Bunny(int length, int theHeight) {
        length = this.length; // backwards – no good!
        height = theHeight; // fine because a different name
        this.color = "white"; // fine, but redundant
    }
    
    //using this()
    //If you choose to call it, the this() call must be the first noncommented 
    //statement in the constructor.
    public Bunny(int length) {
        this("BLACK",length, 20);
        System.out.println("in constructor");
        //this("BLACK",length, 20); //ERROR: call to this must be first statement in constructor
    }

    public Bunny(String color, int height, int length) {
        this.color = color;
        this.height = height;
        this.length = length;
    }
    
    public static void main(String[] args) {
        Bunny b = new Bunny(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color); //0 2 white
    }
}
