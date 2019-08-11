package edu.oca.java.se8.certification.practice.test.chapter6;


public class _4 {

    public void nested() {
        nested(2, true);
    } // g1

    public int nested(int level, boolean height) {
        return nested(level);
    }

    public int nested(int level) {
        return level + 1;
    }// g2

    public static void main(String[] outOfTheBox) {
        //System.out.print(new _4().nested()); //void not allowed here
    }
}
