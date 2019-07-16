package edu.oca.java.se8.certification._1Z0_808.chapter5.overridingAndOverloading;

public class BactrianCamel extends Camel {

    /*private int getNumberOfHumps() { // DOES NOT COMPILE
        return 2;
    }*/
    
    @Override
    public String getNumberOfHumps() {
        return "2";
    }

    /*
    The method in the child class is a new method and not an override of the 
    method in the parent class.
    */
    private int getNumberOfHumpsPrivate() {
        return 2;
    }
    
    private int getNumberOfHumpsPrivate(int number) {
        return number;
    }
}
