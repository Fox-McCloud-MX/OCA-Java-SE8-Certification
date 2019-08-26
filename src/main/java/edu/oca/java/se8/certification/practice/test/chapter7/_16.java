package edu.oca.java.se8.certification.practice.test.chapter7;

public class _16 extends Ship{

    public int weight = 2;
    public int height = 4;

    public void printDetails() {
        System.out.print(super.getWeight() + ","/* + super.height*/);
    }

    public static final void main(String[] fuel) {
        new _16().printDetails();
    }
}

class Ship {

    protected int weight = 3;
    private int height = 5;

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
