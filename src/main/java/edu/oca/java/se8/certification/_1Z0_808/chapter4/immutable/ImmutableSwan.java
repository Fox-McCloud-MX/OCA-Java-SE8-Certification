package edu.oca.java.se8.certification._1Z0_808.chapter4.immutable;

//One step in making a class immutable is to omit the setters.
public class ImmutableSwan {
    private int numberEggs;

    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    public int getNumberEggs() {
        return numberEggs;
    }
}
