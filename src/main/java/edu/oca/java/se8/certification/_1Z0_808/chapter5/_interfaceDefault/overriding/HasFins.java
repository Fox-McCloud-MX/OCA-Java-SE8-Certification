package edu.oca.java.se8.certification._1Z0_808.chapter5._interfaceDefault.overriding;

public interface HasFins {

    public default int getNumberOfFins() {
        return 4;
    }

    public default double getLongestFinLength() {
        return 20.0;
    }

    public default boolean doFinsHaveScales() {
        return true;
    }
}
