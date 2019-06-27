package edu.oca.java.se8.certification._1Z0_808.chapter3;

public class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilderMethods stringBuilderMethods = new StringBuilderMethods();
        //stringBuilderMethods.multipleMethods();
        //stringBuilderMethods.append();
        //stringBuilderMethods.insert();
        //stringBuilderMethods.delete();
        //stringBuilderMethods.stringBuilderEquality();
        stringBuilderMethods.stringEquality();
    }

    //charAt(), indexOf(), length(), and substring()
    public void multipleMethods() {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch); //anim 7 s.
    }

    public void append() {
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true
    }

    public void insert() {
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb);

        //java.lang.StringIndexOutOfBoundsException: String index out of range: 11
        sb.insert(11, "$");
        System.out.println(sb);
    }

    public void delete() {
        StringBuilder sb = new StringBuilder("abcdef");

        sb.delete(1, 1); // sb = abcdef
        System.out.println(sb);

        sb.delete(1, 3); // sb = adef
        System.out.println(sb);

        //sb is mutable
        sb.deleteCharAt(5); // throws an exception
    }

    public void stringBuffer() {
        //Before Java 5.
        //More slowly because it is thread safe.
        StringBuffer stringBuffer = new StringBuffer("ABCDE");

        stringBuffer.length();
    }

    public void stringBuilderEquality() {
        StringBuilder one = new StringBuilder(); //heap space
        StringBuilder two = new StringBuilder(); //heap space
        StringBuilder three = one.append("a");   //heap space

        System.out.println(one == two); // false
        System.out.println(one == three); // true

        //one and three both point to the same object
        three.append("B");

        System.out.println("one object: " + one);
        System.out.println("three object: " + three);
        System.out.println(one == three); // true
    }

    public void stringEquality() {

        //x and y both point to the string pool object
        String x = "Hello World"; //String pool
        String y = "Hello World"; //String pool

        System.out.println(x == y); // true

        //z point to diferent string pool object
        String z = " Hello World".trim();
        System.out.println(x == z); // false
        System.out.println(y == z); // false

        String w = new String("Hello World");   //heap space
        String o = "Hello World";               //string pool
        System.out.println(o == w); // false

        //method equals
        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // true
        System.out.println(y.equals(z)); // true
        System.out.println(w.equals(o)); // true
    }
}
