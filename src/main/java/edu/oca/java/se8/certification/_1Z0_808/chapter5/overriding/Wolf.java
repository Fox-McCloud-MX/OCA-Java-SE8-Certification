package edu.oca.java.se8.certification._1Z0_808.chapter5.overriding;

public class Wolf extends Canine {

    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}
