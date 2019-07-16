package edu.oca.java.se8.certification._1Z0_808.chapter5.overridingAndOverloading._static;

public class Panda extends Bear{

    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
    
    /* sneeze() in Panda cannot override sneeze() in Bear overridden method is static */
    /*public void sneeze() { // DOES NOT COMPILE
        System.out.println("Panda bear sneezes quietly");
    }*/

    /* hibernate() in Panda cannot override sneeze() in Bear overridden method is static */
    /*public static void hibernate() { // DOES NOT COMPILE
        System.out.println("Panda bear is going to sleep");
    }*/

    public static void main(String[] args) {
        Panda.eat();
    }
}
