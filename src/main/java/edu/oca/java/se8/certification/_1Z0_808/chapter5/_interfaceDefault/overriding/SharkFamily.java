package edu.oca.java.se8.certification._1Z0_808.chapter5._interfaceDefault.overriding;

public interface SharkFamily extends HasFins {

    @Override
    public default int getNumberOfFins() {
        return 8;
    }

    @Override
    public double getLongestFinLength();

    //missing default
    /*public boolean doFinsHaveScales() { // DOES NOT COMPILE
        return false;
    }*/
}
