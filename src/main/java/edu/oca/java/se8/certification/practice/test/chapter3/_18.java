package edu.oca.java.se8.certification.practice.test.chapter3;

public class _18 {

    public static void main(String[] args) {
        int dayOfWeek = 0;
        //final long saturday = 6;
        final byte saturday = 6;
        switch (dayOfWeek) {
            default:
                System.out.print("Another Weekday");
                break;
            case saturday:
                System.out.print("Weekend!");
        }
    }
}
