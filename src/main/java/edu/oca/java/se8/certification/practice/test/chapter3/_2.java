package edu.oca.java.se8.certification.practice.test.chapter3;

public class _2 {

    public static void main(String[] args) {
        int meal = 5;
        int tip = 2;
        int total = meal + (meal > 6 ? ++tip : --tip);
    }
}
