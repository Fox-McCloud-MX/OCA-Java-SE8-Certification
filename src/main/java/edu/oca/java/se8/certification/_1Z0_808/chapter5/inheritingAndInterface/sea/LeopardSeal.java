package edu.oca.java.se8.certification._1Z0_808.chapter5.inheritingAndInterface.sea;

/* provide an implementation for the interface methods */
public class LeopardSeal implements HasTail, HasWhiskers{

    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }

}
