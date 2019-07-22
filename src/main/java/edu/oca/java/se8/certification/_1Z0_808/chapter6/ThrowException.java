package edu.oca.java.se8.certification._1Z0_808.chapter6;

public class ThrowException {

    public static void main(String[] args) throws Exception {
        ThrowException throwException = new ThrowException();

        throwException.throwException();
    }

    public void throwException() throws Exception {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new Exception();
        }
    }

    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result; //before catch finally done
    }
}
