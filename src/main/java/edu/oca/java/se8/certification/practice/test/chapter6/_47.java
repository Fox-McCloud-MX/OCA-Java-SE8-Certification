package edu.oca.java.se8.certification.practice.test.chapter6;

public class _47 {

    public static Long getScore(Long timeRemaining) {
        return 2 * timeRemaining; // m1
    }

    public static void main(String[] refs) {
        final int startTime = 4;
        //System.out.print(getScore(startTime)); // m2 missing cast (long)
    }
}
