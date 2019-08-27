package edu.oca.java.se8.certification._1Z0_808.chapter5.casting.downcasting;

public class Downcasting {
    public static void main(String[] args) {
        Animal animal = new Cat();
        
        ((Cat) animal).meow();
    }
}