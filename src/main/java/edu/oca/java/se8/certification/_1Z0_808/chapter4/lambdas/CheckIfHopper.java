package edu.oca.java.se8.certification._1Z0_808.chapter4.lambdas;

public class CheckIfHopper implements CheckTrait {

    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
