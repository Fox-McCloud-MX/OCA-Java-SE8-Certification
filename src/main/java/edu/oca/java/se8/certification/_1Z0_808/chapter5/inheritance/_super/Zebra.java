package edu.oca.java.se8.certification._1Z0_808.chapter5.inheritance._super;

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age); //call to Animal’s constructor, which takes a single argument.
    }

    public Zebra() {
        this(4);
    }
}
