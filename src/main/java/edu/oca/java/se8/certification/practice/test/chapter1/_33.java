package edu.oca.java.se8.certification.practice.test.chapter1;

public class _33 {

    static int start = 2;
    final int end;

    public _33(int x) {
        x = 4;
        end = x;
    }

    public void fly(int distance) {
        System.out.print(end - start + " ");
        System.out.print(distance);
    }

    public static final void main(String... start) {
        new _33(10).fly(5);
    }
}
