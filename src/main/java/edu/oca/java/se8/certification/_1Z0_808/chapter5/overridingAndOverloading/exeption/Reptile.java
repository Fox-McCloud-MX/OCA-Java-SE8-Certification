package edu.oca.java.se8.certification._1Z0_808.chapter5.overridingAndOverloading.exeption;

public class Reptile {

    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception {
        return 2;
    }
}
