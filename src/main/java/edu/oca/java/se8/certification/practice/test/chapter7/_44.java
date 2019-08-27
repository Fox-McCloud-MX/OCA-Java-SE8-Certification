package edu.oca.java.se8.certification.practice.test.chapter7;

abstract public class _44 extends House {

    @Override
    protected abstract Object getSpace();

    public static void main(String[] squareFootage) {
        System.out.print("Let's start the party!");
    }

}

abstract class House {

    protected abstract Object getSpace();
}

abstract class Room extends House {

    /*public*/ abstract Object getSpace(Object list);
}
