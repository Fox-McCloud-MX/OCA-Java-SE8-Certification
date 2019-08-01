package edu.oca.java.se8.certification.practice.test.chapter2;

public class _48 {

    public void play() {
        System.out.print("play-");
    }

    public void finalize() {
        System.out.print("clean-");
    }

    public static void main(String[] args) {
        _48 car = new _48();
        car.play();
        System.gc();
        _48 doll = new _48();
        doll.play();
    }
}
