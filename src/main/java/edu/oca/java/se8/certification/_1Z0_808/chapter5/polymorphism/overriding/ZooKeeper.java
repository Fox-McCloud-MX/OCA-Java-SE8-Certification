package edu.oca.java.se8.certification._1Z0_808.chapter5.polymorphism.overriding;

public class ZooKeeper {

    public static void main(String[] args) {
        Animal animal = new Gorilla();
        System.out.println(animal.getName());
    }
}
