
package edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.duck;

import edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        //goose.floatInWater(); // DOES NOT COMPILE
    }
}
