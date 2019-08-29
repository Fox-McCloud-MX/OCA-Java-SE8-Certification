package edu.oca.java.se8.certification.practice.test.chapter9;

public class _17 {

    interface Target {

        boolean needToAim(double angle); //d -> d
    }

    static void prepare(double angle, Target t) {
        boolean ready = t.needToAim(angle); // k1
        System.out.println(ready);
    }

    public static void main(String[] args) {
        prepare(45, d -> d > 5 || d < -5); // k2
    }
}
