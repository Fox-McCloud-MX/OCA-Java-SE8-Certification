package edu.oca.java.se8.certification._1Z0_808.chapter4;

public class Overloading {

    public void fly(String s) {
        System.out.print("string ");
    }

    public void fly(Object o) {
        System.out.print("object ");
    }
    
    public static String glide(String s) {
        return "1";
    }

    public static String glide(String... s) {
        return "2";
    }

    public static String glide(Object o) {
        return "3";
    }

    public static String glide(String s, String t) {
        return "4";
    }

    public static void main(String[] args) {
        Overloading r = new Overloading();

        r.fly("test");  //String s
        r.fly(56);      //Object o -> Autoboxes to Integer.
        
        System.out.print(glide("a"));           // 1
        System.out.print(glide("a", "b"));      // 4    
        System.out.print(glide("a", "b", "c")); // 2
    }//196
}
