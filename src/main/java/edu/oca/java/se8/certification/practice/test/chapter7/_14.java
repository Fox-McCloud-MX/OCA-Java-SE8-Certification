package edu.oca.java.se8.certification.practice.test.chapter7;

public class _14 implements Run, Jog{

    @Override
    public void walk() {
        System.out.print("Sprinting!");
    }

    public static void main(String[] args) {
        new _14().walk();
    }
}

interface Run {

    default void walk() {
        System.out.print("Walking and running!");
    }
}

interface Jog {

    default void walk() {
        System.out.print("Walking and jogging!");
    }
}
