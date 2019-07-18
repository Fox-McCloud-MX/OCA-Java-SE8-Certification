package edu.oca.java.se8.certification._1Z0_808.chapter5._interfaceDefault.inheritance;

/* 
types Walk and Run are incompatible; 
class Cat inherits unrelated defaults for getSpeed() from types Walk and Run 
 */
public class Cat implements Walk, Run {

    @Override
    public int getSpeed() {
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
