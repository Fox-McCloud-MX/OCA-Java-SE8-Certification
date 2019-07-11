package edu.oca.java.se8.certification._1Z0_808.chapter4.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {
        Lambdas lambdas = new Lambdas();
        
        lambdas.removeIf();
    }

    public void removeIf() {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies); // [hoppy]
    }
}
