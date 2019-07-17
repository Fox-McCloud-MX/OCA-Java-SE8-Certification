package edu.oca.java.se8.certification._1Z0_808.chapter5.hidingVariables;

public class Jellyfish extends Animal {

    public int length = 5;

    public static void main(String[] args) {
        Jellyfish jellyfish = new Jellyfish();
        Animal animal = new Jellyfish();
        System.out.println(jellyfish.length); //5
        System.out.println(animal.length); //2
    }
}
