package edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.inland;

import edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.shore.Bird; // different package than Bird

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        //bird.floatInWater(); // DOES NOT COMPILE
        //System.out.println(bird.text); // DOES NOT COMPILE
    }
}
