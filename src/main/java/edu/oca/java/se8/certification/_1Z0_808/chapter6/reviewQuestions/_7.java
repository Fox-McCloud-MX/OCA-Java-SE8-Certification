package edu.oca.java.se8.certification._1Z0_808.chapter6.reviewQuestions;

public class _7 {

    public void go() {
        System.out.print("A");
        try {
            stop();
        } catch (ArithmeticException e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public void stop() {
        System.out.print("E");
        Object x = null;
        x.toString();
        System.out.print("F");
    }

    public static void main(String[] args) {
        new _7().go();
    }
}
