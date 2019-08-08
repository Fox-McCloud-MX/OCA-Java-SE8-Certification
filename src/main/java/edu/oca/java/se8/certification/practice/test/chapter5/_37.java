package edu.oca.java.se8.certification.practice.test.chapter5;

public class _37 {

    public static void main(String[] args) {
        String race = "";
        loop:
        do {
            race += "x";
            break loop;
        } while (true);
        System.out.println(race);
    }
}
