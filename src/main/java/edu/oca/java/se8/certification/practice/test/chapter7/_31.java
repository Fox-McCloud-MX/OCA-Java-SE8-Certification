package edu.oca.java.se8.certification.practice.test.chapter7;

public final class _31 extends Rectangle {

    /*public int getEqualSides() { // overridden method is static
        return 4;
    }*/ // x2

    public static void main(String[] corners) {
        final _31 myFigure = new _31(); // x3
        System.out.print(myFigure.getEqualSides());
    }

}

abstract class Parallelogram {

    private int getEqualSides() {
        return 0;
    }
}

abstract class Rectangle extends Parallelogram {

    public static int getEqualSides() {
        return 2;
    } // x1
}
