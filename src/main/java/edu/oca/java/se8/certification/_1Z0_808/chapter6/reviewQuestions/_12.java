package edu.oca.java.se8.certification._1Z0_808.chapter6.reviewQuestions;

public class _12 {

    public String name;

    public void run() {
        System.out.print("1");
        try {
            System.out.print("2");
            name.toString();
            System.out.print("3");
        } catch (NullPointerException e) {
            System.out.print("4");
            throw e;
        }
        System.out.print("5");
    }

    public static void main(String[] args) {
        _12 jerry = new _12();
        jerry.run();
        System.out.print("6");
    }
}
