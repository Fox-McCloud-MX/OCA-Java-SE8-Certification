package edu.oca.java.se8.certification.practice.test.chapter7;

public abstract class _18 extends RightTriangle { // g2

    public String getDescription() {
        return "irt";
    }

    public static void main(String[] edges) {
        //final Triangle shape = new _18(); // g3 -> _18 is abstract; cannot be instantiated
        //System.out.print(shape.getDescription());
    }

}

abstract class Triangle {

    abstract String getDescription();
}

class RightTriangle extends Triangle {

    protected String getDescription() {
        return "rt";
    } // g1
}
