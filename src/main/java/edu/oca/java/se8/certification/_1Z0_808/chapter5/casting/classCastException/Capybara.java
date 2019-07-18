package edu.oca.java.se8.certification._1Z0_808.chapter5.casting.classCastException;

public class Capybara extends Rodent{
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara) rodent; // Throws ClassCastException at runtime
    }
}
