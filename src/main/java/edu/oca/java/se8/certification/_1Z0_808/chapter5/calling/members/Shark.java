package edu.oca.java.se8.certification._1Z0_808.chapter5.calling.members;

public class Shark extends Fish {

    private int numberOfFins = 8;
    protected int size = 99;

    public Shark(int age) {
        super(age);
        //this.size = 4;
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long"); //0
        System.out.print(" with " + this.numberOfFins + " fins");
    }

    public static void main(String[] args) {
        Shark shark = new Shark(0);

        shark.displaySharkDetails();
    }
}
