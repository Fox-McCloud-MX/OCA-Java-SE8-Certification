package edu.oca.java.se8.certification.practice.test.chapter3;

public class _20 {

    public static void main(String[] vars) {
        int leaders = 10 * (2 + (1 + 2 / 5)); //missing )
        int followers = leaders * 2;
        System.out.print(leaders + followers < 10 ? "Too few" : "Too many");
    }
}
