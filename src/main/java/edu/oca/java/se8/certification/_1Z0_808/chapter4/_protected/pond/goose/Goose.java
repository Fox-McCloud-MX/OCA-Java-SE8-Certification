
package edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.goose;

import edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose();
        //other.floatInWater(); // DOES NOT COMPILE
        //System.out.println(other.text); // DOES NOT COMPILE
    }
}
