package edu.oca.java.se8.certification.practice.test.chapter3;

public class _24 {

    public final static void main(String... args) {
        int flavors = 30;
        int eaten = 0;
        switch (flavors) {
            case 30:
                eaten++;
            case 40:
                eaten += 2;
            default:
                eaten--;
        }
        System.out.print(eaten); //2
    }
}
