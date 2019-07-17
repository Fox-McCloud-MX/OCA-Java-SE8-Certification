package edu.oca.java.se8.certification._1Z0_808.chapter5._interfaceDefault;

public interface IsWarmBlooded {

    boolean hasScales();

    public default double getTemperature() {
        return 10.0;
    }
}
