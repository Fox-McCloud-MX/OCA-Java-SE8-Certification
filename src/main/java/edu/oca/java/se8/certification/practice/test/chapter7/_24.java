package edu.oca.java.se8.certification.practice.test.chapter7;

//public class _24 extends Sphere implements Planet {
public class _24 extends Planet implements Sphere {

    public _24() {
        super();
    }

    public String getName() {
        return "Mars";
    }

    public static void main(final String[] probe) {
        System.out.print(((Planet) new _24()).getName());
    }
}

interface Sphere {

    default String getName() {
        return "Unknown";
    }
}

abstract class Planet {

    abstract String getName();
}
