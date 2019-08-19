package edu.oca.java.se8.certification.practice.test.chapter8;

public class _5 {

    public static void main(String... teams) {
        int score = 1; //score is in the scope of try statement
        try {
            //int score = 1;
            System.out.print(score++);
        } catch (Throwable t) {
            System.out.print(score++);
        } finally {
            System.out.print(score++);
        }
        System.out.print(score++);
    }
}
