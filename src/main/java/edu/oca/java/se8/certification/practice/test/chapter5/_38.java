package edu.oca.java.se8.certification.practice.test.chapter5;

public class _38 {

    private static int count;
    private static String[] stops = new String[]{"Washington",
        "Monroe", "Jackson", "LaSalle"};

    public static void main(String[] args) {
        while (count < stops.length) {
            if (stops[count++].length() < 8) {
                continue;
            }
        }
        System.out.println(count); //4
    }
}
