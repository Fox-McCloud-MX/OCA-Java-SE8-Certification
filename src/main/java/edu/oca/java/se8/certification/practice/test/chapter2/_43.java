package edu.oca.java.se8.certification.practice.test.chapter2;

public class _43 {

    public void play() {
        System.out.print("play-");
    }

    public void finalizer() {
        System.out.print("clean-");
    }

    public static void main(String[] fun) {
        _43 car = new _43();
        car.play();
        System.gc();
        _43 doll = new _43();
        doll.play();
    }
}
