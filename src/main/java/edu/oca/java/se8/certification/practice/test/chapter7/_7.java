package edu.oca.java.se8.certification.practice.test.chapter7;

class Automobile {

    private final String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {

    protected String drive() {
        return "Driving car";
    }
}

public class _7 extends Car {

    public static void main(String[] wheels) {
        final Car car = new _7();
        System.out.print(car.drive());
    }
}
