package edu.oca.java.se8.certification.practice.test.chapter5;

public class _16 {

    private static int count;
    private static String[] stops = new String[]{"Washington",
        "Monroe", "Jackson", "LaSalle"};

    //static {System.out.println(count);} //0
    public static void main(String[] args) {
        while (count < stops.length) {
            if (stops[count++].length() < 8) {
                break;
            }
        }
        System.out.println(count); //2
    }
}
