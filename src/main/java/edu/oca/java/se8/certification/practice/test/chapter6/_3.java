package edu.oca.java.se8.certification.practice.test.chapter6;

public class _3 {

    private static int price = 5;

    public boolean sell() {
        if (price < 10) {
            price++;
            return true;
        } else if (price >= 10) {
            return false;
        }
        return false; //missing return statement
    }

    public static void main(String[] cash) {
        new _3().sell();
        new _3().sell();
        new _3().sell();
        System.out.print(price);
    }
}
