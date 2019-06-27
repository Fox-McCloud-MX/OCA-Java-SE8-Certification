package edu.oca.java.se8.certification._1Z0_808.chapter3;

public class Equality {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1 == t3); // true
        
        System.out.println(t1.equals(t2)); // false
        System.out.println(t1.equals(t3)); // true
        
        t3.name = "Toño";
        System.out.println(t1.equals(t3)); // true
        
    }
}

class Tiger {
    String name;
}
