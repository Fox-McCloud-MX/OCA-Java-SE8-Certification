package edu.oca.java.se8.certification.practice.test.chapter7;

public class _1 extends Cinema {

    public _1(String movie) {
        super(movie); //need to add
    }

    public static void main(String[] showing) {
        //System.out.print(new _1("Another Trilogy").name); //name is private
    }
}

class Cinema {

    private String name;

    public Cinema(String name) {
        this.name = name;
    }
}
