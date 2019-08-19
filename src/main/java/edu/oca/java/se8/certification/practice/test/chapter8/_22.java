package edu.oca.java.se8.certification.practice.test.chapter8;

public class _22 {

    public void openDrawbridge() throws RuntimeException { // q1
        try {
            throw new KnightAttackingException();
        } catch (Exception e) {
            throw new ClassCastException();
        } finally {
           // throw new CastleUnderSiegeException(); // q2
        }
    }

    public static void main(String[] moat) {
        new _22().openDrawbridge(); // q3
    }
}

class CastleUnderSiegeException extends Exception {
}

class KnightAttackingException extends CastleUnderSiegeException {
}
