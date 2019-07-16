package edu.oca.java.se8.certification._1Z0_808.chapter5.inheritance._super;


public class Animal {

    private int age;
    private String name;

    public Animal(int age, String name) {
        super(); //call to the parent constructor defi ned in java.lang.Object,
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super(); //call to the parent constructor defi ned in java.lang.Object,
        this.age = age;
        this.name = null;
    }
}
