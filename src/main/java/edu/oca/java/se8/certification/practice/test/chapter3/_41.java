package edu.oca.java.se8.certification.practice.test.chapter3;

public class _41 {

    public static int getResult(int threshold) {
        return threshold > 5 ? 1 : 0;
    }

    public static final void main(String[] days) {
        System.out.print(getResult(5) + getResult(1)
            + getResult(0) + getResult(2) + ""); //0
    }
}
