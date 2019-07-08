package edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.goose;

import edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.shore.Bird; // in a different package

public class Gosling extends Bird{
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }
}
