package edu.oca.java.se8.certification.practice.test.chapter3;

public class _42 {

    public String runTest(boolean spinner, boolean roller) {
        if (spinner = roller) {
            return "up";
        } else {
            return roller ? "down" : "middle";
        }
    }

    public static final void main(String pieces[]) {
        final _42 tester = new _42();
        System.out.println(tester.runTest(false, true));
    }
}
