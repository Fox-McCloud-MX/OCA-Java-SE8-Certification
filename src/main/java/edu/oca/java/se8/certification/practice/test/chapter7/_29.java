package edu.oca.java.se8.certification.practice.test.chapter7;

public class _29 extends Ball implements Equipment {

    public _29() {
        super(5);
    }

    public Ball get() {
        return this;
    }

    public static void main(String[] passes) {
        Equipment equipment = (Equipment) (Ball) new _29().get();
        System.out.print(((_29) equipment).size);
    }
}

abstract class Ball {

    protected final int size;

    public Ball(int size) {
        this.size = size;
    }
}

interface Equipment {
}
