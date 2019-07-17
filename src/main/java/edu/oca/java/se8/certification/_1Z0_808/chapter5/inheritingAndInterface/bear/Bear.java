package edu.oca.java.se8.certification._1Z0_808.chapter5.inheritingAndInterface.bear;

public class Bear implements Herbivore, Omnivore{

    @Override
    public int eatPlants(int quantity) {
        System.out.println("Eating plants: " + quantity);
        return quantity;
    }

    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
