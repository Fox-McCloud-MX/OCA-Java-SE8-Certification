package edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.swan;

import edu.oca.java.se8.certification._1Z0_808.chapter4._protected.pond.shore.Bird; // in different package than Bird

public class Swan extends Bird { // but subclass of bird
    public void swim() {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }
    
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text);// package access to superclass
    }
        
    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        //other.floatInWater(); // DOES NOT COMPILE
        //System.out.println(other.text); // DOES NOT COMPILE
    }
}
