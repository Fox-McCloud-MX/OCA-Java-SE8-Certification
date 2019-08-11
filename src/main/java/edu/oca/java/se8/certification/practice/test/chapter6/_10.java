package edu.oca.java.se8.certification.practice.test.chapter6;

public class _10 {

    private int rope = 1;
    protected boolean outside;

    public _10() {
        this(4); // p1
        outside = true;
    }

    public _10(int rope) {
        this.rope = outside ? rope : rope + 1;
    }

    public static void main(String[] bounce) {
        System.out.print(new _10().rope);
    }
}
