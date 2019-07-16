package edu.oca.java.se8.certification._1Z0_808.chapter5.overridingAndOverloading.exeption;

public class Snake extends Reptile{

    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    protected double getWeight() throws InsufficientDataException {
        return 2;
    }
}
